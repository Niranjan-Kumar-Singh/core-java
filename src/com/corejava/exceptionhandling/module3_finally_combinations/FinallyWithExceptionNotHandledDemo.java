package com.corejava.exceptionhandling.module3_finally_combinations;

/*
 * Demonstrates:
 * - Exception occurs
 * - No catch block
 * - finally still executes
 */
public class FinallyWithExceptionNotHandledDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Try started");

			@SuppressWarnings("unused")
			int x = 10 / 0; // Exception occurs
		} finally {
			// This will execute before program crashes
			System.out.println("Finally block executed");
		}

		// This line never executes
		System.out.println("Program end");
	}
}
