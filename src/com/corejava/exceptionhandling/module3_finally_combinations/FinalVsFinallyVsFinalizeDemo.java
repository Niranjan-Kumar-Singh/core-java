package com.corejava.exceptionhandling.module3_finally_combinations;

/*
 * Demonstrates:
 * - final keyword
 * - finally block
 * - finalize() method
 */
public class FinalVsFinallyVsFinalizeDemo {

	// final variable
	final int x = 10;

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		FinalVsFinallyVsFinalizeDemo obj = new FinalVsFinallyVsFinalizeDemo();

		try {
			System.out.println("Try block");
		} finally {
			System.out.println("Finally block");
		}

		// Suggest garbage collection
		obj = null;
		System.gc();
	}

	// finalize method (deprecated in modern Java)
	protected void finalize() throws Throwable {
		System.out.println("finalize method executed");
	}
}
