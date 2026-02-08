package com.corejava.oops.module5_design;

/**
 * HIGH COHESION EXAMPLE
 *
 * This class has ONLY ONE responsibility:
 * → Storing employee data into the database
 *
 * It does NOT:
 * - Calculate salary
 * - Send emails
 *
 * Hence, this class is HIGHLY COHESIVE.
 */
public class HighCohesionDatabaseService {

	/**
	 * Stores employee data into database
	 */
	public void saveEmployee() {
		System.out.println("Employee data saved into database");
	}
}