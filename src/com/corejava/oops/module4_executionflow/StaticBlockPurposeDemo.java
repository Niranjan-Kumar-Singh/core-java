package com.corejava.oops.module4_executionflow;

/**
 * Static blocks execute during class loading
 */
public class StaticBlockPurposeDemo {

	static {
		System.out.println("Static Block Executed");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}