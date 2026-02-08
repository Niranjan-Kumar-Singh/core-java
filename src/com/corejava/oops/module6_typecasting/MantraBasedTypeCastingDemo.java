package com.corejava.oops.module6_typecasting;

/**
 * MANTRA BASED OBJECT TYPE CASTING DEMO
 *
 * Demonstrates all 3 Mantras: 
 * 1) Relationship check (Compile-time) 
 * 2) Assignment compatibility (Compile-time) 
 * 3) Runtime object check (Runtime)
 */
public class MantraBasedTypeCastingDemo {

	public static void main(String[] args) {

		/*
		 * MANTRA 1: There must be some relationship between reference type (d) and casting type (C)
		 */
		Object o = new String("Niranjan");

		// StringBuffer sb = (StringBuffer) o;
		// ❌ Compile-Time Error: inconvertible types
		// Reason: String and StringBuffer are not related

		/*
		 * MANTRA 2: Casting type (C) must be same or child of target type (A)
		 */
		String s = (String) o; // ✔ Valid
		System.out.println(s);

		// StringBuffer sb2 = (String) o;
		// ❌ Compile-Time Error: incompatible types

		/*
		 * MANTRA 3: Runtime object type must be same or child of casting type (C)
		 */
		Object o2 = new String("Java");

		String s2 = (String) o2; // ✔ Runtime OK
		System.out.println(s2);

		@SuppressWarnings("unused")
		Object o3 = new Object();

		// String s3 = (String) o3;
		// ❌ Runtime Exception: ClassCastException
	}
}