package com.corejava.exceptionhandling.module6_common_exceptions;

/**
 * Demonstrates NumberFormatException.
 */
public class NumberFormatExceptionDemo {

	public static void main(String[] args) {

		String input = "abc";

		int number = Integer.parseInt(input); // Exception
		System.out.println(number);
	}
}
