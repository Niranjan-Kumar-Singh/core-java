package com.corejava.oops.module5_design;

/**
 * ❌ LOW COHESION One class handling multiple unrelated responsibilities
 */
public class LowCohesionDemo {

	public void calculateSalary() {
		System.out.println("Salary calculated");
	}

	public void saveToDatabase() {
		System.out.println("Saved to database");
	}

	public void sendEmail() {
		System.out.println("Email sent");
	}
}