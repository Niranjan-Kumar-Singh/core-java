package com.corejava.exceptionhandling.module6_common_runtime;

/**
 * Demonstrates propagation and stack unwinding.
 */
public class ExceptionFlowLifecycleDemo {

	static void method1() {
		method2();
	}

	static void method2() {
		method3();
	}

	static void method3() {
		throw new RuntimeException("Failure occurred");
	}

	public static void main(String[] args) {
		method1();
	}
}