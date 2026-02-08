package com.corejava.oops.module5_design;

/**
 * ❌ TIGHTLY COUPLED CLASS Car is directly dependent on Engine implementation
 */
class TightlyCoupledCar {

	// Direct dependency (BAD DESIGN)
	private TightlyCoupledEngine engine = new TightlyCoupledEngine();

	public void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}