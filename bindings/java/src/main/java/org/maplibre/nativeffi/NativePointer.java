package org.maplibre.nativeffi;

/** Opaque borrowed backend address. The host retains ownership of the backend resource. */
public final class NativePointer {
  public static final NativePointer NULL = new NativePointer(0, null);
  private final long address;
  private final Scope scope;

  NativePointer(long address, Scope scope) {
    this.address = address;
    this.scope = scope;
  }

  public static NativePointer ofAddress(long address) {
    return address == 0 ? NULL : new NativePointer(address, null);
  }

  /** Returns the address bit pattern while this borrowed pointer is valid. */
  public long address() {
    if (scope != null) scope.check();
    return address;
  }

  public boolean isNull() {
    return address() == 0;
  }

  @Override
  public boolean equals(Object other) {
    long value = address();
    return other instanceof NativePointer pointer && value == pointer.address();
  }

  @Override
  public int hashCode() {
    return Long.hashCode(address());
  }

  @Override
  public String toString() {
    return "NativePointer[0x" + Long.toHexString(address()) + "]";
  }
}
