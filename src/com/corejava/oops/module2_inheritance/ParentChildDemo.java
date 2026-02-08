package com.corejava.oops.module2_inheritance;

/*
 * Demonstrates:
 * 1. Parent object
 * 2. Child object
 * 3. Parent reference holding Child object
 */
public class ParentChildDemo {

	public static void main(String[] args) {

		// Parent reference holding Parent object
		Parent p = new Parent();
		p.property();
		p.marry();

		System.out.println("-----");

		// Child reference holding Child object
		Child c = new Child();
		c.property(); // Inherited method
		c.marry(); // Overridden method

		System.out.println("-----");

		// Parent reference holding Child object
		Parent p1 = new Child();
		p1.property(); // Parent method
		p1.marry(); // Child version (Runtime Polymorphism)
	}
}