package com.corejava.exceptionhandling.module3_finally_combinations;

/*
 * Demonstrates:
 * - Nested try-catch-finally
 */
public class NestedTryCatchFinallyDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Outer try started");
			try {
				System.out.println("Inner try started");

				@SuppressWarnings("unused")
				int x = 10 / 0; // Exception
			} catch (ArithmeticException e) {
				System.out.println("Inner catch executed");
			} finally {
				System.out.println("Inner finally executed");
			}

		} catch (Exception e) {
			System.out.println("Outer catch executed");
		} finally {
			System.out.println("Outer finally executed");
		}

		System.out.println("Program ends normally");
	}
}
