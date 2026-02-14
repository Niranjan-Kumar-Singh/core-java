package com.corejava.exceptionhandling.module1_intro_hierarchy;

/*
 * This program demonstrates Exception Hierarchy.
 * Parent reference can hold child exception object.
 */
public class ExceptionHierarchyDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Parent references holding child objects
		Throwable t = new ArithmeticException();
		Exception e = new ArithmeticException();
		RuntimeException re = new ArithmeticException();

		System.out.println("Exception hierarchy assignment is valid");
	}
}
