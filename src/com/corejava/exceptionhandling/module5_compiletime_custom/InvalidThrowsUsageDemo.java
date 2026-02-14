package com.corejava.exceptionhandling.module5_compiletime_custom;

/*
 * Demonstrates invalid throws usage.
 */

public class InvalidThrowsUsageDemo {

	/*
	 * Invalid: class Test throws Exception { }
	 */

	static class Test {

		void m1() throws Exception {
			throw new Exception("Valid usage of throws in method");
		}
	}

	public static void main(String[] args) {

		Test t = new Test();

		try {
			t.m1();
		} catch (Exception e) {
			System.out.println("Exception handled: " + e.getMessage());
		}
	}
}