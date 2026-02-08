package com.corejava.oops.module6_typecasting;

/**
 * INVALID CASTING – COMPILE TIME
 */
public class InvalidCastingCompileTime {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String s = new String("Durga");

		// StringBuffer sb = (StringBuffer) s;
		// ❌ Compile-Time Error: inconvertible types
	}
}