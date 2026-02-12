package com.corejava.exceptionhandling.module4_propagation;

/*
 * Demonstrates Exception Propagation (Stack Unwinding)
 * 
 * Flow:
 * main() → methodA() → methodB()
 * Exception occurs in methodB()
 * No catch block present
 * JVM propagates exception upward
 */
public class ExceptionPropagationDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");
		methodA();
		System.out.println("Main Ended"); // This will NOT execute
	}

	public static void methodA() {
		System.out.println("Method A Started");
		methodB();
		System.out.println("Method A Ended"); // Will NOT execute
	}

	public static void methodB() {
		System.out.println("Method B Started");

		// Runtime Exception
		System.out.println(10 / 0); // ArithmeticException

		System.out.println("Method B Ended"); // Will NOT execute
	}
}