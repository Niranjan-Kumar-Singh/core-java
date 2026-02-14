package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates StackOverflowError.
 */
public class StackOverflowErrorDemo {

	static void recursiveCall() {
		recursiveCall(); // No base condition
	}

	public static void main(String[] args) {
		recursiveCall();
	}
}