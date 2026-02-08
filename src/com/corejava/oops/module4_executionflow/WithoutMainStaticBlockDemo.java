package com.corejava.oops.module4_executionflow;

/**
 * Pre Java 1.7 only
 */
public class WithoutMainStaticBlockDemo {

	static {
		System.out.println("Printed from static block");
		System.exit(0);
	}
}