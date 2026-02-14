package com.corejava.exceptionhandling.module1_intro_hierarchy;

/*
 * This program demonstrates Error.
 * StackOverflowError occurs due to infinite recursion.
 */
public class StackOverflowErrorDemo {

	public static void main(String[] args) {
		method();
	}

	static void method() {
		// Method calling itself infinitely
		method();
	}
}
