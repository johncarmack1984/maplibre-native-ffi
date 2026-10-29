package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

final class Memory {
  private Memory() {}

  static MemorySegment readPointer(MemorySegment source, long size) {
    return source.get(ADDRESS, 0).reinterpret(size);
  }

  static byte[] bytes(MemorySegment pointer, long length) {
    if (length == 0) return new byte[0];
    return pointer.reinterpret(length).toArray(JAVA_BYTE);
  }

  static String text(MemorySegment pointer, long length) {
    return new String(bytes(pointer, length), StandardCharsets.UTF_8);
  }

  static byte[] bytesZ(MemorySegment pointer) {
    return textZ(pointer).getBytes(StandardCharsets.UTF_8);
  }

  static String textZ(MemorySegment pointer) {
    return pointer.address() == 0 ? "" : pointer.reinterpret(Long.MAX_VALUE).getString(0);
  }

  static byte[] bytesView(MemorySegment source) {
    return bytes(source.get(ADDRESS, 0), source.get(JAVA_LONG, 8));
  }

  static String textView(MemorySegment source) {
    return new String(bytesView(source), StandardCharsets.UTF_8);
  }

  static <T> List<T> array(
      MemorySegment pointer,
      long count,
      long stride,
      long size,
      Function<MemorySegment, T> decode) {
    int length = Math.toIntExact(count);
    if (length == 0) return List.of();
    if (stride < size)
      throw new IllegalArgumentException("Native array stride is smaller than its element");
    var data = pointer.reinterpret(Math.addExact(Math.multiplyExact(count - 1, stride), size));
    var items = new ArrayList<T>(length);
    for (int i = 0; i < length; i++) items.add(decode.apply(data.asSlice(i * stride, size)));
    return List.copyOf(items);
  }
}
