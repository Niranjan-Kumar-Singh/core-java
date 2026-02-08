package com.corejava.oops.module4_constructors;

import java.io.IOException;

/**
 * Demonstrates constructor exception rules.
 */
class ParentEx {
	ParentEx() throws IOException {
		System.out.println("Constructor called");
	}
}

class ChildEx extends ParentEx {

	ChildEx() throws IOException {
		super();
	}
}

public class ConstructorExceptionDemo {
	public static void main(String[] args) throws IOException {
		new ChildEx();
	}
}