package io.s1n.value;

public record Weight(Type type, Double weight) {

  private enum Type {
    PRODUCT,
    PACKAGE
  }
}
