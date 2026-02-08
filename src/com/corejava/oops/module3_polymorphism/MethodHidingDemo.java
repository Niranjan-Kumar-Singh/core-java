package com.corejava.oops.module3_polymorphism;

/**
 * Demonstrates Method Hiding
 */
public class MethodHidingDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		StaticParent p = new StaticChild();
		p.m1(); // Parent version
	}
}