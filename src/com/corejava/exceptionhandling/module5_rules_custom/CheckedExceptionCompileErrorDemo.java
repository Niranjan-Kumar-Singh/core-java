package com.corejava.exceptionhandling.module5_rules_custom;

/*
 * Demonstrates:
 * Rule 1: Unreported Checked Exception
 * Compile-time error when checked exception is not handled or declared.
 */

public class CheckedExceptionCompileErrorDemo {

	public static void main(String[] args) {

		// Compile-Time Error:
		// unreported exception java.lang.InterruptedException;
		// must be caught or declared to be thrown

		/*
		 * Thread.sleep(1000);
		 */

		// Proper Handling
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException handled.");
		}

		System.out.println("main() method completes");
	}
}
