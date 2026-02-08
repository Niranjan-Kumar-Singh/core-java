package com.corejava.oops.module4_executionflow;

/**
 * Demonstrates Instance Control Flow
 *
 * Order: 1. Identification of instance members 2. Execution of instance
 * variables & instance blocks 3. Constructor execution
 */
public class InstanceControlFlowDemo {

	int i = 10; // Step 3, 9

	{
		m1(); // Step 10
		System.out.println("First Instance Block"); // Step 12
	}

	public InstanceControlFlowDemo() { // Step 5
		System.out.println("Constructor"); // Step 15
	}

	public static void main(String[] args) { // Step 1
		@SuppressWarnings("unused")
		InstanceControlFlowDemo t = new InstanceControlFlowDemo(); // Step 2
		System.out.println("Main");
	}

	public void m1() {
		System.out.println(j); // Step 11
	}

	{
		System.out.println("Second Instance Block"); // Step 13
	}

	int j = 20; // Step 8, 14
}