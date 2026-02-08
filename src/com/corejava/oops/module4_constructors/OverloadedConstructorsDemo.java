package com.corejava.oops.module4_constructors;

/**
 * Demonstrates constructor overloading.
 */
class OverloadDemo {

	OverloadDemo() {
		this(10);
		System.out.println("No-arg constructor");
	}

	OverloadDemo(int i) {
		this(10.5);
		System.out.println("Int-arg constructor");
	}

	OverloadDemo(double d) {
		System.out.println("Double-arg constructor");
	}
}

public class OverloadedConstructorsDemo {
	public static void main(String[] args) {

		new OverloadDemo();
		System.out.println("-----");
		new OverloadDemo(10);
		System.out.println("-----");
		new OverloadDemo(10.5);
	}
}