package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates classification of failures.
 */
public class FailureClassificationDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {
			String value = null;
			value.length(); // Programming bug
		} catch (NullPointerException e) {
			System.out.println("Programming bug detected");
		}
	}
}