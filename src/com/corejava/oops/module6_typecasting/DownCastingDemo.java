package com.corejava.oops.module6_typecasting;

/**
 * DOWNCASTING DEMO
 *
 * Explicit casting required
 */
public class DownCastingDemo {

	public static void main(String[] args) {

		Parent p = new Child(); // Upcasting
		Child c = (Child) p; // Downcasting

		c.m1(); // Child m1()
		c.m2(); // Child specific method
	}
}