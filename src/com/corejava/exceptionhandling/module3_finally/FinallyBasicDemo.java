package com.corejava.exceptionhandling.module3_finally;

/*
 * Demonstrates:
 * - finally block executes whether exception occurs or not
 */
public class FinallyBasicDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Inside try block");
		} finally {
			// This block always executes
			System.out.println("Inside finally block");
		}

		System.out.println("Program completed");
	}
}