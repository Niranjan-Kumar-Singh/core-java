package com.corejava.exceptionhandling.module4_throw_throws_propagation;

import java.io.IOException;
import java.sql.SQLException;

/*
 * Demonstrates that order in throws does NOT matter
 */
public class ThrowsOrderDemo {

	public void method1() throws IOException, SQLException {
		System.out.println("Method1 executed");
	}

	public void method2() throws SQLException, IOException {
		System.out.println("Method2 executed");
	}

	public static void main(String[] args) throws IOException, SQLException {

		ThrowsOrderDemo obj = new ThrowsOrderDemo();

		obj.method1();
		obj.method2();

		System.out.println("Order does not matter in throws clause");
	}
}
