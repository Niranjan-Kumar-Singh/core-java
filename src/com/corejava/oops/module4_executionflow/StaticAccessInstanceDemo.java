package com.corejava.oops.module4_executionflow;

/**
 * Static area cannot directly access instance members
 */
public class StaticAccessInstanceDemo {

	int x = 10;

	public static void main(String[] args) {

		// System.out.println(x); ❌ Compile-time error

		StaticAccessInstanceDemo t = new StaticAccessInstanceDemo();
		System.out.println(t.x); // ✔ Valid
	}
}