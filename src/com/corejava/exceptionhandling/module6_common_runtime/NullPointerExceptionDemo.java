package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates NullPointerException.
 */
public class NullPointerExceptionDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		String name = null;

		// JVM checks reference before method call
		System.out.println(name.length()); // NPE
	}
}