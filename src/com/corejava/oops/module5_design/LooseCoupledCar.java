package com.corejava.oops.module5_design;

/**
 * ✅ LOOSELY COUPLED CLASS Depends on abstraction (Engine)
 */
public class LooseCoupledCar {

	private Engine engine;

	// Constructor Injection
	public LooseCoupledCar(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}