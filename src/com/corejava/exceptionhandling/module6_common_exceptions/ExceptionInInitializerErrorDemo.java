package com.corejava.exceptionhandling.module6_common_exceptions;

/**
 * Demonstrates ExceptionInInitializerError.
 */
public class ExceptionInInitializerErrorDemo {

	static int value = 10 / 0; // Causes error during class loading

	public static void main(String[] args) {
		System.out.println("Main method");
	}
}
