package com.corejava.oops.module4_constructors;

/**
 * Demonstrates constructor inheritance rules.
 */
class Parent {
	Parent(int i) {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {

	Child() {
		super(10); // mandatory
		System.out.println("Child constructor");
	}
}

public class ConstructorInheritanceDemo {
	public static void main(String[] args) {
		new Child();
	}
}