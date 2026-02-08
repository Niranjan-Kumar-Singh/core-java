package com.corejava.oops.module3_polymorphism;

/**
 * Runtime polymorphism demo
 */
public class MethodOverridingDemo {

	public static void main(String[] args) {

		ParentOverride p = new ChildOverride();
		p.marry();
	}
}