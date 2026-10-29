package org.maplibre.nativeffi;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import org.maplibre.nativeffi.internal.c.*;

/**
 * Bridges the C API's one-shot completions to Java futures. Completion callbacks and dependent
 * stages may execute on a native thread, including the submitting thread. They must return promptly
 * and must not wait for native work on that thread. Use asynchronous stages to dispatch host work.
 * Cancelling a future cancels observation only: native work and its callback state remain alive
 * until native releases the registration.
 */
final class Completions {
  private static final AtomicLong NEXT = new AtomicLong();
  private static final ConcurrentHashMap<Long, Pending<?>> PENDING = new ConcurrentHashMap<>();
  // A release callback cannot close the arena containing its own executing stub. Both stubs
  // therefore live for the process; only the Java state of a submission is retained per call.
  private static final MemorySegment CALLBACK =
      ((CompletionCallback) Completions::complete).stub(Arena.global());
  private static final MemorySegment RELEASE =
      ((UserDataRelease) context -> PENDING.remove(context.address())).stub(Arena.global());

  private Completions() {}

  /** The submitting C call. Return its status without throwing after it accepts the completion. */
  @FunctionalInterface
  public interface Submission {
    int invoke(MemorySegment completion, MemorySegment diagnostic);
  }

  /** Submits a command whose successful completion reports its published generations. */
  public static CompletableFuture<CommandCompletion> command(Submission submission) {
    return submit(
        submission,
        result -> new CommandCompletion(result.generation(), result.render_update_generation()));
  }

  /** Submits an operation with no result, such as an asynchronous release. */
  public static CompletableFuture<Void> run(Submission submission) {
    return submit(submission, result -> null);
  }

  /**
   * Submits an operation and copies its borrowed result with {@code decode}. The decoder runs only
   * for success, before native releases the result. It must copy everything it returns: the result
   * and all pointers reachable from it are borrowed only for that call. Decoder failures complete
   * the future exceptionally. A synchronous native rejection throws {@link MaplibreException}.
   */
  public static <T> CompletableFuture<T> submit(
      Submission submission, Function<CompletionResult, T> decode) {
    var state = new Pending<>(decode);
    long token = NEXT.incrementAndGet();
    PENDING.put(token, state);
    boolean accepted = false;
    try (var arena = Arena.ofConfined()) {
      var completion = Completion.allocate(arena);
      completion.callback(CALLBACK);
      completion.user_data(MemorySegment.ofAddress(token));
      completion.release_user_data(RELEASE);
      var diagnostic = Diagnostic.allocate(arena);
      int status = submission.invoke(completion.segment(), diagnostic.segment());
      if (status != C.MLN_STATUS_OK) {
        throw new MaplibreException(status, diagnostic.message().getString(0), 0);
      }
      accepted = true;
      return state.future;
    } finally {
      if (!accepted) PENDING.remove(token);
    }
  }

  private static void complete(MemorySegment context, MemorySegment address) {
    PENDING.get(context.address()).complete(address);
  }

  private static final class Pending<T> {
    final Function<CompletionResult, T> decode;
    final CompletableFuture<T> future = new CompletableFuture<>();

    Pending(Function<CompletionResult, T> decode) {
      this.decode = decode;
    }

    void complete(MemorySegment address) {
      try (var arena = Arena.ofConfined()) {
        var result =
            new CompletionResult(
                address.reinterpret(CompletionResult.LAYOUT.byteSize(), arena, null));
        if (result.status() == C.MLN_STATUS_OK) {
          // A cancelled observer must not suppress a decoder that adopts an owned result.
          T value = decode.apply(result);
          if (!future.complete(value)
              && value instanceof Owner owner
              && owner.state.closed.compareAndSet(false, true))
            owner.state.dispose.accept(owner.id());
        } else {
          var diagnostic = result.diagnostic();
          String message =
              diagnostic.size() == 0
                  ? ""
                  : new String(
                      diagnostic
                          .data()
                          .reinterpret(diagnostic.size())
                          .toArray(java.lang.foreign.ValueLayout.JAVA_BYTE),
                      StandardCharsets.UTF_8);
          future.completeExceptionally(
              new MaplibreException(result.status(), message, result.generation()));
        }
      } catch (Throwable failure) {
        future.completeExceptionally(failure);
      }
    }
  }
}
