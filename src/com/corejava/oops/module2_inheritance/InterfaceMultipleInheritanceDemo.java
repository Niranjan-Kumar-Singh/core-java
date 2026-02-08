package com.corejava.oops.module2_inheritance;

/*
 * Demonstrates Multiple Inheritance using interfaces
 */
public class InterfaceMultipleInheritanceDemo implements InterfaceA, InterfaceB {

	/*
	 * Single implementation for both interfaces
	 */
	@Override
	public void m1() {
		System.out.println("Single implementation for both interfaces");
	}

	public static void main(String[] args) {

		InterfaceMultipleInheritanceDemo obj = new InterfaceMultipleInheritanceDemo();
		obj.m1();
	}
}