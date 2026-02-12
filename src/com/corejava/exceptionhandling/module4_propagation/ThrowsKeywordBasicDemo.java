package com.corejava.exceptionhandling.module4_propagation;

/*
 * Demonstrates basic usage of throws keyword
 */
public class ThrowsKeywordBasicDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Before Sleep");

		// This method throws checked exception
		Thread.sleep(2000);

		System.out.println("After Sleep");
	}
}