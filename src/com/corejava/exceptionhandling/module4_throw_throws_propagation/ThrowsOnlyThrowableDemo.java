package com.corejava.exceptionhandling.module4_throw_throws_propagation;

/*
 * Demonstrates that throws accepts only Throwable types
 */
public class ThrowsOnlyThrowableDemo {

	public static void main(String[] args) {

		System.out.println("Check method declaration rules in code comments.");
	}

	/*
	 * INVALID CASE:
	 * 
	 * void method() throws Test { }
	 * 
	 * Compile-time error if Test does not extend Throwable
	 */
}
