package com.corejava.oops.module6_typecasting;

class A {
	static void m1() {
		System.out.println("A static m1()");
	}
}

class B extends A {
	static void m1() {
		System.out.println("B static m1()");
	}
}

/**
 * STATIC METHOD + CASTING
 */
public class StaticMethodCastingDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		A a = new B();

		a.m1(); // A static m1()
		((B) a).m1(); // B static m1()
	}
}