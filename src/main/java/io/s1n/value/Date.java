package io.s1n.value;

import java.time.LocalDate;

public record Date(DateType dateType, LocalDate localDate) {

  enum DateType{
    PRODUCTION,
    WARRANTY,
    REVIEW
  }
}
