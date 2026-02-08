package com.corejava.oops.module4_executionflow;

/**
 * Demonstrates illegal forward reference
 */
public class IllegalForwardReferenceDemo {

	static {
		// System.out.println(x); // ❌ Compile-time error: illegal forward reference
	}

	static int x = 10;
	
	public static void main(String[] args) {
		
	}
}