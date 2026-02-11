package com.corejava.exceptionhandling.module3_finally;

/*
 * Demonstrates:
 * - If finally contains return,
 *   it overrides try return
 */
public class FinallyOverridesReturnDemo {
	public static void main(String[] args) {
		System.out.println(test());
	}

	@SuppressWarnings("finally")
	static int test() {
		try {
			return 100;
		} finally {
			return 200; // This overrides previous return
		}
	}
}