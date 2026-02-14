package com.corejava.exceptionhandling.module5_compiletime_custom;

/*
 * Demonstrates:
 * Rule 2: Unreachable Catch Block
 */

public class UnreachableCatchOrderDemo {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			int x = 10 / 0;
		}

		/*
		 * Compile-Time Error: exception ArithmeticException has already been caught
		 * 
		 * catch (Exception e) {
		 *		System.out.println("Generic Exception caught");
		 * } catch (ArithmeticException e) {
		 * 		System.out.println("ArithmeticException caught");
		 * }
		 */

		// Correct Order
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		} catch (Exception e) {
			System.out.println("Generic Exception caught");
		}
	}
}