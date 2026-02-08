package com.corejava.oops.module5_design;

/**
 * Demonstrates HIGH COHESION
 *
 * Each class has ONLY ONE responsibility: - Salary calculation - Database
 * storage - Email notification
 */
public class HighCohesionDemo {

	public static void main(String[] args) {

		HighCohesionSalaryService salaryService = new HighCohesionSalaryService();
		salaryService.calculateSalary();

		HighCohesionDatabaseService databaseService = new HighCohesionDatabaseService();
		databaseService.saveEmployee();

		HighCohesionEmailService emailService = new HighCohesionEmailService();
		emailService.sendEmail();
	}
}