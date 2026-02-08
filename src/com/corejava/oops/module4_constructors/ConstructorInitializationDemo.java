package com.corejava.oops.module4_constructors;

/**
 * Demonstrates the main purpose of a constructor.
 *
 * Purpose of constructor: 
 * → To initialize an object 
 * → NOT to create an object
 */
class Student {

	String name;
	int rollNo;

	// Constructor for initialization
	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
}

public class ConstructorInitializationDemo {
	public static void main(String[] args) {

		Student s1 = new Student("Niranjan", 101);
		Student s2 = new Student("Ravi", 102);

		System.out.println(s1.name + " - " + s1.rollNo);
		System.out.println(s2.name + " - " + s2.rollNo);
	}
}