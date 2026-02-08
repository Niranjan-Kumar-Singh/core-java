package com.corejava.oops.module3_polymorphism;

/*
 * Demonstrates METHOD SIGNATURE
 *
 * Method Signature = Method Name + Parameter Types
 * Return type is NOT part of the method signature.
 */

public class MethodSignatureDemo {

	// Method signature: m1(int)
	public void m1(int i) {
		System.out.println("m1(int) method called");
	}

	// Method signature: m2(String)
	public void m2(String s) {
		System.out.println("m2(String) method called");
	}

	public static void main(String[] args) {

		// Creating object of TestMethodSignature
		MethodSignatureDemo t = new MethodSignatureDemo();

		// Compiler resolves method call using method signature
		t.m1(10); // Calls m1(int)
		t.m2("niranjan"); // Calls m2(String)

		// No method with signature m3(double)
		// t.m3(10.5); // Compile-Time Error
	}
}