package com.corejava.exceptionhandling.module1_basics;

/*
 * This program demonstrates:
 * Stack trace order is based on runtime stack.
 */
public class StackTraceOrderDemo {

	public static void main(String[] args) {
		first();
	}

	static void first() {
		second();
	}

	static void second() {
		third();
	}

	static void third() {
		// Exception occurs here
		System.out.println(10 / 0);
	}
}