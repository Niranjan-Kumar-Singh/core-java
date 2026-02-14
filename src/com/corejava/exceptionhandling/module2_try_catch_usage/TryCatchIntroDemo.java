package com.corejava.exceptionhandling.module2_try_catch_usage;

/*
 * This class demonstrates:
 * - What happens when an exception occurs
 * - How try-catch prevents abnormal termination
 */
public class TryCatchIntroDemo {

	public static void main(String[] args) {

		// Normal statement
		System.out.println("Program started");

		// try block contains risky code
		try {
			int result = 10 / 0; // Risky code (ArithmeticException)
			System.out.println("Result: " + result);
		}
		// catch block handles the exception
		catch (ArithmeticException e) {
			System.out.println("Exception handled: Division by zero");
		}

		// This statement executes because exception is handled
		System.out.println("Program ended normally");
	}
}
