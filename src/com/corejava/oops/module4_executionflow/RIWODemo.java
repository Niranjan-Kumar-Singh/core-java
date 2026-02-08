package com.corejava.oops.module4_executionflow;

/**
 * Demonstrates RIWO (Read Indirectly Write Only)
 */
public class RIWODemo {

	static int x = 10;

	static {
		m1(); // Indirect read → allowed
		System.out.println(x); // Direct read → allowed (already initialized)
	}

	public static void m1() {
		System.out.println(x); // Indirect read
	}
	
	public static void main(String[] args) {
		
	}
}