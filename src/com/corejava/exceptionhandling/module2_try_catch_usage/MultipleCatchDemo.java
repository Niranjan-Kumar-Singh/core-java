package com.corejava.exceptionhandling.module2_try_catch_usage;

/*
 * Demonstrates:
 * - Multiple catch blocks
 * - Different handling for different exceptions
 */
public class MultipleCatchDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {
			String s = null; // Null reference
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception handled");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException handled");
		} catch (Exception e) {
			System.out.println("Generic exception handled");
		}
	}
}
