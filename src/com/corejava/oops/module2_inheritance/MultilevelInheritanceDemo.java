package com.corejava.oops.module2_inheritance;

/*
 * Demonstrates Multilevel Inheritance
 */
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {

		ChildLevel c = new ChildLevel();

		// Accessing methods from all levels
		c.land(); // From GrandParent
		c.house(); // From ParentLevel
		c.car(); // From ChildLevel
	}
}