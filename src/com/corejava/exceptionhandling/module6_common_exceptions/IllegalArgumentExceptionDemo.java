package com.corejava.exceptionhandling.module6_common_exceptions;

/**
 * Demonstrates programmatic exception throwing.
 */
public class IllegalArgumentExceptionDemo {

	public static void setAge(int age) {

		if (age < 18) {
			throw new IllegalArgumentException("Age must be >= 18");
		}

		System.out.println("Age set successfully");
	}

	public static void main(String[] args) {
		setAge(10);
	}
}
