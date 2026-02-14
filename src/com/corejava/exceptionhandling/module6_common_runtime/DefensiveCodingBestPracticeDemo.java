package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates defensive programming.
 */
public class DefensiveCodingBestPracticeDemo {

	public static int divide(int a, int b) {

		if (b == 0) {
			throw new IllegalArgumentException("Divider cannot be zero");
		}

		return a / b;
	}

	public static void main(String[] args) {

		try {
			System.out.println(divide(10, 0));
		} catch (Exception e) {
			System.out.println("Handled safely: " + e.getMessage());
		}
	}
}