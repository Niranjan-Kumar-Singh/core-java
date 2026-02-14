package com.corejava.exceptionhandling.module4_throw_throws_propagation;

/*
 * Demonstrates basic usage of throw keyword
 */
public class ThrowKeywordBasicDemo {

	public static void main(String[] args) {

		int age = 16;

		if (age < 18) {

			// Manually creating and throwing exception
			throw new IllegalArgumentException("Age must be 18 or above");
		}

		System.out.println("Eligible to vote");
	}
}
