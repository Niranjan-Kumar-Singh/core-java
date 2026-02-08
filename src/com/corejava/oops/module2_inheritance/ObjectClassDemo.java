package com.corejava.oops.module2_inheritance;

/*
 * Demonstrates OBJECT CLASS inheritance
 *
 * Object class is the root class for all Java classes.
 * Every class in Java is a child of Object either directly or indirectly.
 */

public class ObjectClassDemo {
	public static void main(String[] args) {

		// Creating Object class object
		Object o = new Object();

		// Returns hash code value of the object
		System.out.println(o.hashCode());

		// Returns string representation of the object
		System.out.println(o.toString());

		// Returns runtime class information
		System.out.println(o.getClass());
	}
}