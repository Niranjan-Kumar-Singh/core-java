package com.corejava.exceptionhandling.module2_try_catch_usage;

/*
 * This class shows:
 * - What happens when exception is NOT handled
 * - Program terminates abnormally
 */
public class TryCatchWithoutHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Statement 1");

		// Exception occurs here
		System.out.println(10 / 0);

		// This line is never executed
		System.out.println("Statement 3");
	}
}
