package com.corejava.oops.module4_constructors;

/**
 * Demonstrates difference between: 1. Instance block 2. Constructor
 *
 * Instance Block: → Executes for every object creation → Used for common logic
 *
 * Constructor: → Used mainly for initialization
 */
class Test {

	static int count = 0;

	// Instance block
	{
		count++;
	}

	Test() {
	}

	Test(int i) {
	}
}

public class ConstructorVsInstanceBlockDemo {
	public static void main(String[] args) {

		new Test();
		new Test(10);
		new Test(20);

		System.out.println("Objects created: " + Test.count);
	}
}