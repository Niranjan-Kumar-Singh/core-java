package com.corejava.oops.module2_inheritance;

/*
 * Demonstrates Hierarchical Inheritance
 */
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {

		ChildOne c1 = new ChildOne();
		c1.property();
		c1.bike();

		System.out.println("-----");

		ChildTwo c2 = new ChildTwo();
		c2.property();
		c2.car();
	}
}