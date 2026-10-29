package org.maplibre.nativeffi;

/** The unsigned generation bit patterns published by a committed command. */
public record CommandCompletion(long generation, long renderUpdateGeneration) {}
