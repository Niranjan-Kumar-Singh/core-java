package com.corejava.exceptionhandling.module1_basics;

/*
 * This program demonstrates Runtime Stack Mechanism.
 * Each method call creates a stack frame.
 * Stack follows LIFO order.
 */
public class RuntimeStackDemo {

	public static void main(String[] args) {
		// main() method calls doStuff()
		doStuff();
	}

	static void doStuff() {
		// doStuff() calls doMoreStuff()
		doMoreStuff();
	}

	static void doMoreStuff() {
		// Executes normally and returns
		System.out.println("Hello");
	}
}