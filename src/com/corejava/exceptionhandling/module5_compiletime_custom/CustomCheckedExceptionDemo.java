package com.corejava.exceptionhandling.module5_compiletime_custom;

@SuppressWarnings("serial")
/*
 * Demonstrates Custom Checked Exception
 */

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomCheckedExceptionDemo {

	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be >= 18");
		}
	}

	public static void main(String[] args) {

		try {
			validateAge(15);
		} catch (InvalidAgeException e) {
			System.out.println("Handled: " + e.getMessage());
		}
	}
}