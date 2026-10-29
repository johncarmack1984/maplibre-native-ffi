/**
 * Managed Java bindings to the MapLibre Native C API, using Java 25 FFM on desktop platforms.
 *
 * <p>Load a matching native runtime with {@link org.maplibre.nativeffi.NativeLibrary}. The JVM must
 * enable native access with {@code --enable-native-access=ALL-UNNAMED}. Native runtime JARs are
 * discovered on the classpath; an exact library path or {@code java.library.path} also works.
 *
 * <p>Owned handles require explicit cleanup. {@code close()} disposes a handle; asynchronous roots
 * also expose {@code release()} to wait for retirement. A child keeps its parent reachable. Handle
 * IDs remain readable after cleanup to match event sources. A refused release leaves the handle
 * usable. A leaked handle is disposed by a cleaner and reported to that thread's uncaught exception
 * handler. Cleanup cannot substitute for retiring GPU work in the order the C API requires.
 *
 * <p>Values copy native strings, arrays, and bytes. Lists are immutable and byte array accessors
 * return copies. Optional scalar fields use boxed values; {@code null} means absent. Unsigned C
 * integers use Java's signed carrier with the same bits. Open enums and flags preserve unknown
 * bits. C statuses raise {@link org.maplibre.nativeffi.MaplibreException}; declared absence returns
 * {@code null} or an empty list.
 *
 * <p>Asynchronous operations return {@link java.util.concurrent.CompletableFuture}. Cancellation or
 * timeout stops observation, not native work. Continuations may run on a native callback thread;
 * use an asynchronous executor for work that must block or run on a host thread. Ordered commands
 * also have a {@code discarding()} facade. A later command completion fences earlier commands.
 *
 * <p>Callbacks may arrive on native threads. Keep request handles to answer later, then consume or
 * close them. Callback failures go to the current thread's uncaught exception handler; a status
 * callback may throw {@link org.maplibre.nativeffi.MaplibreException} to return its status. Native
 * registrations consume their context on first submission and require the host to retain pointer
 * storage and executable stubs until the native release callback. Scoped responses, borrowed views,
 * and their borrowed pointers may be used only on the callback thread before its scope ends. Owners
 * refuse cleanup while a borrow is active. End graphics work before exiting from a callback.
 */
package org.maplibre.nativeffi;
