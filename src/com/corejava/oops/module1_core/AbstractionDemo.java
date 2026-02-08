package com.corejava.oops.module1_core;

/**
 * Demonstrates ABSTRACTION using abstract class.
 */
public class AbstractionDemo {

	public static void main(String[] args) {

		Bank b1 = new SBI();
		System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest());

		Bank b2 = new HDFC();
		System.out.println("HDFC Rate of Interest: " + b2.getRateOfInterest());
	}
}