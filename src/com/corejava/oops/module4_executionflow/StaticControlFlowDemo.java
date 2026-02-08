package com.corejava.oops.module4_executionflow;

/**
 * Demonstrates Static Control Flow
 *
 * Order:
 * 1. Identification of static members (top → bottom)
 * 2. Execution of static variables & static blocks (top → bottom)
 * 3. Execution of main method
 */
public class StaticControlFlowDemo {

	static int i = 10; // Step 1, 7

	static {
		m1(); // Step 8
		System.out.println("First Static Block"); // Step 10
	}

	public static void main(String[] args) { // Step 3
		m1(); // Step 13
		System.out.println("Main Method"); // Step 15
	}

	public static void m1() { // Step 4
		System.out.println(j); // Step 9, 14
	}

	static {
		System.out.println("Second Static Block"); // Step 11
	}

	static int j = 20; // Step 6, 12
}