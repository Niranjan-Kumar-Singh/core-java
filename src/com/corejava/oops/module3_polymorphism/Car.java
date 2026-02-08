package com.corejava.oops.module3_polymorphism;

/**
 * Car HAS-A Engine Association using object reference
 */
public class Car {

	private Engine engine = new Engine();

	public void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}