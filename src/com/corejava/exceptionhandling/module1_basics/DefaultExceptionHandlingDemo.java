package com.corejava.exceptionhandling.module1_basics;

/*
 * This program demonstrates Default Exception Handling.
 * No try-catch is used.
 * JVM handles the exception.
 */
public class DefaultExceptionHandlingDemo {

	public static void main(String[] args) {
		doStuff();
	}

	static void doStuff() {
		doMoreStuff();
	}

	static void doMoreStuff() {
		// Exception occurs here
		// ArithmeticException is raised
		System.out.println(10 / 0);
	}
}