package com.corejava.oops.module6_typecasting;

/**
 * UPCASTING DEMO
 *
 * Parent reference holding Child object This is always safe and implicit
 */
public class UpCastingDemo {

	public static void main(String[] args) {

		Parent p = new Child(); // Upcasting

		p.m1(); // Child m1() → Runtime polymorphism
		// p.m2(); // ❌ Compile-time error
	}
}