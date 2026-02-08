package com.corejava.oops.module3_polymorphism;

/*
 * Demonstrates AGGREGATION (Weak Has-A Relationship)
 *
 * In aggregation, contained objects can exist independently
 * of the container object.
 */
public class AggregationDemo {

	public static void main(String[] args) {

		Professor p = new Professor("Dr. Rao");
		Department d = new Department(p);

		d.showDetails();
	}
}