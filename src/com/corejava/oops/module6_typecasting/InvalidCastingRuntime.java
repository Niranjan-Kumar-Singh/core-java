package com.corejava.oops.module6_typecasting;

/**
 * INVALID CASTING – RUNTIME
 */
public class InvalidCastingRuntime {

	public static void main(String[] args) {

		Parent p = new Parent();

		@SuppressWarnings("unused")
		Child c = (Child) p; // ❌ Runtime error
	}
}