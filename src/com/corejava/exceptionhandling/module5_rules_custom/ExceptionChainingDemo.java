package com.corejava.exceptionhandling.module5_rules_custom;

/*
 * Demonstrates Exception Chaining
 */

public class ExceptionChainingDemo {

	public static void main(String[] args) {

		try {
			try {
				@SuppressWarnings("unused")
				int x = 10 / 0;
			} catch (ArithmeticException e) {
				throw new RuntimeException("Wrapped Exception", e);
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
