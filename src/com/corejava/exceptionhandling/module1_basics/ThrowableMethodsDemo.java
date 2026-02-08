package com.corejava.exceptionhandling.module1_basics;

/*
 * This program demonstrates methods of Throwable class.
 */
public class ThrowableMethodsDemo {

	public static void main(String[] args) {

		try {
			// Risky code
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {

			// Returns only description
			System.out.println("getMessage():");
			System.out.println(e.getMessage());

			// Returns exception name + description
			System.out.println("\ntoString():");
			System.out.println(e.toString());

			// Prints complete stack trace
			System.out.println("\nprintStackTrace():");
			e.printStackTrace();
		}
	}
}