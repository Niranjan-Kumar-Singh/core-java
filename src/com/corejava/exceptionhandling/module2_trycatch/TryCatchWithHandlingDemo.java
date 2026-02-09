package com.corejava.exceptionhandling.module2_trycatch;

/*
 * This class demonstrates:
 * - Handling exception using try-catch
 * - Program continues normally
 */
public class TryCatchWithHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Statement 1");

		try {
			// Risky code
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			// Alternative logic
			System.out.println(10 / 2);
		}

		// Executes after catch
		System.out.println("Statement 3");
	}
}