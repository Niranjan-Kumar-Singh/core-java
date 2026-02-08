package com.corejava.oops.module4_executionflow;

/**
 * Demonstrates static vs instance execution order
 */
public class StaticVsInstanceDemo {

	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Block");
	}

	StaticVsInstanceDemo() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		new StaticVsInstanceDemo();
		new StaticVsInstanceDemo();
	}
}