package com.corejava.oops.module4_constructors;

/**
 * Demonstrates default constructor generation.
 *
 * Compiler generates default constructor ONLY IF
 * no constructor is written by programmer.
 */
class DefaultDemo {
}

public class DefaultConstructorDemo {
	public static void main(String[] args) {
		new DefaultDemo();
		System.out.println("Object created using default constructor");
	}
}