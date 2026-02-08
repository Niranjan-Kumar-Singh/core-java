package com.corejava.oops.module5_design;

/**
 * Test class for tight coupling
 */
public class TightCouplingDemo {

	public static void main(String[] args) {
		TightlyCoupledCar car = new TightlyCoupledCar();
		car.drive();
	}
}