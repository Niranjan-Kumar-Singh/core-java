package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates AssertionError. Run with -ea JVM flag.
 */
public class AssertionErrorDemo {

	public static void main(String[] args) {

		int x = 5;

		assert x > 10 : "x must be greater than 10";

		System.out.println("Program completed");
	}
}