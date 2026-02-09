package com.corejava.exceptionhandling.module2_trycatch;

/*
 * This code causes compile-time error
 * because duplicate catch blocks are not allowed
 */

public class DuplicateCatchCompileErrorDemo {
	public static void main(String[] args) {
//		try {
//
//		} catch (ArithmeticException e) {
//
//		} catch (ArithmeticException e) {
//
//		}
	}
}

// Compile-time Error:
// exception java.lang.ArithmeticException has already been caught