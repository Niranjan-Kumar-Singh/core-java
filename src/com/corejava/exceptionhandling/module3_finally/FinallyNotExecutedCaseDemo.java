package com.corejava.exceptionhandling.module3_finally;

/*
 * Demonstrates:
 * - finally does not execute when System.exit() is called
 */
public class FinallyNotExecutedCaseDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Try started");
			System.exit(0); // JVM shutdown
		} finally {
			// This will NOT execute
			System.out.println("Finally executed");
		}
	}
}