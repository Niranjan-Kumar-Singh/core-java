package com.corejava.oops.module3_polymorphism;

/**
 * Demonstrates Is-A vs Has-A
 */
public class IsAVsHasADemo {

	public static void main(String[] args) {

		// Is-A
		Student s = new Student();
		s.eat();
		s.study();

		// Has-A
		Car car = new Car();
		car.drive();
	}
}