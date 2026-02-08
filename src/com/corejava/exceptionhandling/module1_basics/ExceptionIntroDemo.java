package com.corejava.exceptionhandling.module1_basics;

/*
 * This program demonstrates:
 * 1. Exception is NOT a syntax error
 * 2. Program compiles successfully
 * 3. Exception occurs only at runtime
 */
public class ExceptionIntroDemo {

	public static void main(String[] args) {

		// Normal statement
		System.out.println("Program started");

		// This line causes ArithmeticException at runtime
		// Division by zero is not allowed
		System.out.println(10 / 0);

		// This statement will never execute
		System.out.println("Program ended");
	}
}