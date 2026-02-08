package com.corejava.oops.module5_design;

/**
 * Test class for loose coupling
 */
public class LooseCouplingDemo {

	public static void main(String[] args) {

		Engine petrol = new PetrolEngine();
		LooseCoupledCar car1 = new LooseCoupledCar(petrol);
		car1.drive();

		System.out.println("---------------");

		Engine diesel = new DieselEngine();
		LooseCoupledCar car2 = new LooseCoupledCar(diesel);
		car2.drive();
	}
}