package com.corejava.oops.module6_typecasting;

/**
 * METHOD RESOLUTION WITH CASTING
 *
 * Non-static methods → Runtime object decides
 */
public class MethodResolutionCastingDemo {

	public static void main(String[] args) {

		Parent p = new Child();

		p.m1(); // Child m1()
		((Child) p).m1(); // Child m1()
	}
}