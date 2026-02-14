package com.corejava.exceptionhandling.module4_throw_throws_propagation;

import java.io.IOException;
import java.sql.SQLException;

/*
 * Demonstrates multiple exceptions in throws clause
 */
public class MultipleThrowsDemo {

	public static void main(String[] args) throws IOException, SQLException {

		testMethod();
	}

	public static void testMethod() throws IOException, SQLException {

		// Just demonstration (not actually throwing)
		System.out.println("Method declared with multiple exceptions");
	}
}
