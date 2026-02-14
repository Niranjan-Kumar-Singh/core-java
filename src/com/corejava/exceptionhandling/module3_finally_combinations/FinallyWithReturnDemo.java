package com.corejava.exceptionhandling.module3_finally_combinations;

/*
 * Demonstrates:
 * - finally executes even when return is present
 */
public class FinallyWithReturnDemo {
	public static void main(String[] args) {
		System.out.println(testMethod());
	}

	static int testMethod() {
		try {
			System.out.println("Inside try");
			return 10; // Return statement
		} finally {
			// Executes even after return
			System.out.println("Inside finally");
		}
	}
}
