package com.corejava.oops.module1_core;

/**
 * NOT Tightly Encapsulated Inherited Child Class
 *
 * Reason: This class extends a parent class that is NOT tightly encapsulated.
 * Even if this class does not declare any variables, it inherits non-private members from the parent.
 *
 * Hence, this class is also NOT tightly encapsulated.
 */
public class NotTightlyEncapsulatedInheritedChild extends NotTightlyEncapsulatedParent {

	public static void main(String[] args) {
		NotTightlyEncapsulatedInheritedChild obj = new NotTightlyEncapsulatedInheritedChild();

		// Accessing inherited non-private variable
		System.out.println("Inherited x value: " + obj.x);
	}
}