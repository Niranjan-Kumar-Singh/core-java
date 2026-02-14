package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates safe casting using instanceof.
 */
public class SafeCastingDemo {

	public static void main(String[] args) {

		Object obj = "Java";

		if (obj instanceof String) {
			String str = (String) obj;
			System.out.println(str);
		}
	}
}