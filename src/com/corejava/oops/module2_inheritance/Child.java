package com.corejava.oops.module2_inheritance;

/*
 * Child class
 * Child IS-A Parent (Inheritance)
 */
public class Child extends Parent {

	/*
	 * Overriding parent class method Runtime Polymorphism
	 */
	@Override
	public void marry() {
		System.out.println("Trisha | Nayanthara");
	}
}