package com.corejava.oops.module3_polymorphism;

/**
 * Composition example Strong association
 */
public class CarComposition {

	private EngineComponent engine;

	public CarComposition() {
		engine = new EngineComponent();
	}

	public void drive() {
		engine.start();
		System.out.println("Car running");
	}
}