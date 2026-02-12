package com.corejava.exceptionhandling.module4_propagation;

/*
 * Demonstrates throwing checked exception
 * 
 * This WILL NOT compile unless handled or declared
 */
public class ThrowCheckedExceptionDemo {

	public static void main(String[] args) throws Exception {

		// Checked Exception
		throw new Exception("Manually thrown checked exception");
	}
}