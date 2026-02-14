package com.corejava.exceptionhandling.module5_rules_custom;

import java.io.IOException;

/*
 * Demonstrates:
 * Rule 3: Catching fully checked exception without possibility
 */

@SuppressWarnings("unused")
public class FullyCheckedCatchRuleDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Hello");
		}

		/*
		 * Compile-Time Error: exception java.io.IOException is never thrown in body of corresponding try statement
		 * 
		 * catch (IOException e) { }
		 */

		// Allowed
		catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}
