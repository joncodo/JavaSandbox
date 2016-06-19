/**
 * Copyright (C) 2016 Jonathan ODonnell.
 */
package Rentals;

/**
 * Main class.
 *
 * @version 1.0.0
 */
public class Main {

      public static void main(String[] args) {
          // Prints "Hello, World" to the terminal window.
          log("Hello, World from main");

          //return message;
          printMe();
      }

      public static String printMe(){
        log("Print Me");
        return "Hello, World";
      }

      public static void log(String message){
        System.out.println(message);
      }

}
