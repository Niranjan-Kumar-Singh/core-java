package com.corejava.exceptionhandling.module3_finally_combinations;

/*
 * Demonstrates:
 * - Exception occurs
 * - Exception handled
 * - finally still executes
 */
public class FinallyWithExceptionHandledDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Try started");

			@SuppressWarnings("unused")
			int x = 10 / 0; // Exception
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		} finally {
			System.out.println("Finally block executed");
		}

		System.out.println("Program continues normally");
	}
}
