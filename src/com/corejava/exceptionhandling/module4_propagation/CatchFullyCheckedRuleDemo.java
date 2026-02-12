package com.corejava.exceptionhandling.module4_propagation;

import java.io.IOException;

/*
 * Demonstrates compile-time rule for fully checked exceptions
 */
@SuppressWarnings("unused")
public class CatchFullyCheckedRuleDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Hello");
		}

		/*
		 * Uncomment to see compile-time error:
		 * 
		 * catch (IOException e) { }
		 * 
		 * Error: IOException is never thrown in body of corresponding try statement
		 */

		catch (Exception e) { // Allowed (Partially checked)
			System.out.println("Handled");
		}
	}
}