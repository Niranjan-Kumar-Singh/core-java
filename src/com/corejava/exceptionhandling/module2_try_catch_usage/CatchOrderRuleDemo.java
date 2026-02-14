package com.corejava.exceptionhandling.module2_try_catch_usage;

/*
 * Demonstrates:
 * - Correct order of catch blocks
 * - Child exception first, parent last
 */
public class CatchOrderRuleDemo {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			int x = 10 / 0;
		} catch (ArithmeticException e) { // Child
			System.out.println("ArithmeticException handled");
		} catch (Exception e) { // Parent
			System.out.println("Exception handled");
		}
	}
}
