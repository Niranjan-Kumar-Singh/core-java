package com.corejava.oops.module3_polymorphism;

/**
 * Compile-time polymorphism
 */
public class MethodOverloadingDemo {

	public void m1() {
		System.out.println("No-arg");
	}

	public void m1(int i) {
		System.out.println("int-arg");
	}

	public void m1(double d) {
		System.out.println("double-arg");
	}

	public static void main(String[] args) {
		MethodOverloadingDemo t = new MethodOverloadingDemo();
		t.m1();
		t.m1(10);
		t.m1(10.5);
	}
}