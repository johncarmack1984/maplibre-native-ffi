package org.maplibre.nativeffi;

/** A native status failure with its copied diagnostic and published command generation. */
public final class MaplibreException extends RuntimeException {
  private final Status status;
  private final long generation;

  public MaplibreException(int status, String diagnostic, long generation) {
    super(diagnostic.isEmpty() ? "Native status " + Integer.toUnsignedString(status) : diagnostic);
    this.status = new Status(status);
    this.generation = generation;
  }

  /** The raw mln_status value. */
  public Status status() {
    return status;
  }

  /** The unsigned generation bit pattern; zero for a failure that published no map state. */
  public long generation() {
    return generation;
  }
}
