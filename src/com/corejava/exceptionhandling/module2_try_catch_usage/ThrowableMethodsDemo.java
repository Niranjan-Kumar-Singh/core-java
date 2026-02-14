package com.corejava.exceptionhandling.module2_try_catch_usage;

/*
 * Demonstrates:
 * - Methods of Throwable class
 * - How JVM prints exception information
 */
public class ThrowableMethodsDemo {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			int x = 10 / 0;
		} catch (ArithmeticException e) {

			// Prints full stack trace
			System.out.println("printStackTrace():");
			e.printStackTrace();

			// Prints exception name + message
			System.out.println("\ntoString():");
			System.out.println(e.toString());

			// Prints only message
			System.out.println("\ngetMessage():");
			System.out.println(e.getMessage());
		}
	}
}
