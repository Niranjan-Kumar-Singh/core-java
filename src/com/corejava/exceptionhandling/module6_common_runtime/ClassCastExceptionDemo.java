package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates ClassCastException.
 */
public class ClassCastExceptionDemo {

	public static void main(String[] args) {

		Object obj = new Object();

		// Runtime type mismatch
		@SuppressWarnings("unused")
		String str = (String) obj; // ClassCastException
	}
}