package com.corejava.oops.module4_constructors;

/**
 * Demonstrates recursive constructor invocation. This code will NOT compile (concept demo).
 */
class RecursiveDemo {

	RecursiveDemo() {
		this(10);
	}

	RecursiveDemo(int i) {
		// this(); ❌ recursive call
	}
}