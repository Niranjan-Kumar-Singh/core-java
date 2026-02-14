package com.corejava.exceptionhandling.module6_common_exceptions;

/**
 * Demonstrates IllegalThreadStateException.
 */
public class IllegalThreadStateExceptionDemo {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			System.out.println("Thread running");
		});

		t.start();
		t.start(); // Cannot start twice
	}
}
