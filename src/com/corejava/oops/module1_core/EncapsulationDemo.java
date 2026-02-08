package com.corejava.oops.module1_core;

/**
 * Demonstrates usage of Encapsulation.
 */
public class EncapsulationDemo {

	public static void main(String[] args) {

		Student s = new Student();

		// Setting values using setter methods
		s.setName("Niranjan");
		s.setRollNo(101);
		s.setMarks(85);

		// Getting values using getter methods
		System.out.println("Name    : " + s.getName());
		System.out.println("Roll No : " + s.getRollNo());
		System.out.println("Marks   : " + s.getMarks());
	}
}