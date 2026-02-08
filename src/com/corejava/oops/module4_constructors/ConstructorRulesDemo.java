package com.corejava.oops.module4_constructors;

/**
 * Demonstrates constructor rules: 
 * 1. Name must match class name 
 * 2. No return type (not even void)
 */
class RuleDemo {

	// This is NOT a constructor (method)
	@SuppressWarnings("all")
	void RuleDemo() {
		System.out.println("Method, not constructor");
	}

	RuleDemo() {
		System.out.println("Constructor");
	}
}

public class ConstructorRulesDemo {
	public static void main(String[] args) {
		new RuleDemo();
	}
}