package com.corejava.oops.module1_core;

/**
 * Demonstrates ENCAPSULATION
 *
 * All data members are private and accessed using public methods.
 */
class Student {

	// private data members (data hiding)
	private String name;
	private int rollNo;
	private int marks;

	// setter methods (write access)
	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setMarks(int marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		}
	}

	// getter methods (read access)
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getMarks() {
		return marks;
	}
}