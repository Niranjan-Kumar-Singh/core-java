package com.corejava.oops.module6_typecasting;

class X {
	int x = 10;
}

class Y extends X {
	int x = 20;
}

/**
 * VARIABLE RESOLUTION WITH CASTING
 */
public class VariableCastingDemo {

	public static void main(String[] args) {

		X a = new Y();

		System.out.println(a.x); // 10
		System.out.println(((Y) a).x); // 20
	}
}