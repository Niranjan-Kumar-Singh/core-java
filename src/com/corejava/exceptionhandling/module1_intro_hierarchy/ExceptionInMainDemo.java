package com.corejava.exceptionhandling.module1_intro_hierarchy;

/*
 * This program shows what happens
 * when exception occurs directly inside main().
 */
public class ExceptionInMainDemo {

	public static void main(String[] args) {

		System.out.println("Before exception");

		// Exception occurs in main()
		System.out.println(10 / 0);

		// This line will never execute
		System.out.println("After exception");
	}
}
