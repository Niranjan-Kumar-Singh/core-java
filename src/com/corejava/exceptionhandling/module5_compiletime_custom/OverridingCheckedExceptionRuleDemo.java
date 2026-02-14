package com.corejava.exceptionhandling.module5_compiletime_custom;

import java.io.IOException;

/*
 * Demonstrates:
 * Rule 5: Overriding Checked Exception Rule
 */

class Parent {
	void m1() throws IOException {
	}
}

class Child extends Parent {

	/*
	 * Compile-Time Error: Child cannot throw broader checked exception
	 * 
	 * void m1() throws Exception { }
	 */

	// Allowed
	@Override
	void m1() throws IOException {
		System.out.println("Child method");
	}
}

public class OverridingCheckedExceptionRuleDemo {
	public static void main(String[] args) {
		Parent p = new Child();
		try {
			p.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}