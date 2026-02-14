package com.corejava.exceptionhandling.module4_throw_throws_propagation;

import java.io.IOException;

/*
 * Demonstrates overriding rule with throws
 */
public class ParentChildThrowsRuleDemo {

	public static void main(String[] args) throws IOException {

		Parent parentRef = new Child();
		parentRef.display();
	}
}

class Parent {

	void display() throws IOException {
		System.out.println("Parent display");
	}
}

class Child extends Parent {

	@Override
	void display() throws IOException {
		System.out.println("Child display");
	}

	/*
	 * INVALID CASE (Uncomment to see compile error)
	 * 
	 * void display() throws Exception { }
	 * 
	 * Reason: Child cannot throw broader checked exception
	 */
}
