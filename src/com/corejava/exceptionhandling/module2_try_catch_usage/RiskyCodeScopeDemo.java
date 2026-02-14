package com.corejava.exceptionhandling.module2_try_catch_usage;

/*
 * Demonstrates:
 * - Only risky code should be inside try block
 * - Good coding practice
 */
public class RiskyCodeScopeDemo {

	public static void main(String[] args) {

		System.out.println("Program started");

		// Only risky code inside try
		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("Handled division by zero");
		}

		// Safe code outside try
		System.out.println("Program continues safely");
	}
}
