package com.soebes.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstTest {

  @Test
  void first_test_method() {
    First first = new First();
    Assertions.assertEquals(true, first.isThisTrue());
  }
}
