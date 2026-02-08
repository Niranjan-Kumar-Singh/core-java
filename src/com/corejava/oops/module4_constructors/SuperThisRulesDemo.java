package com.corejava.oops.module4_constructors;

/**
 * Demonstrates rules of super() and this()
 */
class SuperThisDemo {

	SuperThisDemo() {
		// compiler inserts super() implicitly
		System.out.println("No-arg constructor");
	}

	SuperThisDemo(int i) {
		this(); // must be first statement
		System.out.println("Int-arg constructor");
	}
}

public class SuperThisRulesDemo {
	public static void main(String[] args) {
		new SuperThisDemo(10);
	}
}