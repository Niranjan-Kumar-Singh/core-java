package com.corejava.oops.module5_design;

/**
 * Test class to demonstrate LOW COHESION
 */
public class LowCohesionService {

	public static void main(String[] args) {

		LowCohesionDemo service = new LowCohesionDemo();

		service.calculateSalary();
		service.saveToDatabase();
		service.sendEmail();
	}
}