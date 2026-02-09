package com.corejava.exceptionhandling.module2_trycatch;

/*
 * This class explains:
 * - Control flow inside try-catch
 * - Which statements are skipped
 */
public class TryCatchControlFlowDemo {

	public static void main(String[] args) {

		System.out.println("S1");

		try {
			System.out.println("S2");
			System.out.println(10 / 0); // Exception occurs here
			System.out.println("S3"); // Skipped
		} catch (ArithmeticException e) {
			System.out.println("S4 - Exception handled");
		}

		System.out.println("S5");
	}
}