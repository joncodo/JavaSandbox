/**
 * Copyright (C) 2016 Jonathan ODonnell.
 */
package Rentals;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Main class unit tests.
 *
 * @version 1.0.0
 */
public class MainTest {
  String message = "Hello, World";
  Main main = new Main();

  @Test
  public void testPrintMe() {
    String mainMessage = main.printMe();

    assertEquals(message, mainMessage);
  }
}
