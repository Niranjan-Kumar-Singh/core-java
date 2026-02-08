package com.corejava.oops.module3_polymorphism;

/**
 * Aggregation example Department HAS-A Professor (weak association)
 */
public class Department {

	// Weak association: department holds only references
	private Professor professor;

	// Injecting existing Professor objects
	public Department(Professor professor) {
		this.professor = professor;
	}

	// Using Professor objects
	public void showDetails() {
		System.out.println("Professor: " + professor.name);
	}
}