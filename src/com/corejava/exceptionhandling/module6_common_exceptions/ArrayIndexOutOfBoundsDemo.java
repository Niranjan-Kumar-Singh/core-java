package com.corejava.exceptionhandling.module6_common_exceptions;

/**
 * Demonstrates ArrayIndexOutOfBoundsException JVM-generated RuntimeException.
 */
public class ArrayIndexOutOfBoundsDemo {

	public static void main(String[] args) {

		int[] arr = new int[3];

		System.out.println("Valid access: " + arr[1]);

		// Invalid index access
		System.out.println(arr[3]); // Runtime crash
	}
}
