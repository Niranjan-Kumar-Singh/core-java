package com.corejava.exceptionhandling.module6_common_exceptions;

/**
 * Shows stack trace order.
 */
public class StackTraceAnalysisDemo {

	static void level1() {
		level2();
	}

	static void level2() {
		level3();
	}

	static void level3() {
		throw new NullPointerException("Demo");
	}

	public static void main(String[] args) {
		level1();
	}
}
