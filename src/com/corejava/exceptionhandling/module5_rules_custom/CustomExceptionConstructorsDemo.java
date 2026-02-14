package com.corejava.exceptionhandling.module5_rules_custom;

@SuppressWarnings("serial")
/*
 * Demonstrates Proper Constructor Design
 */

class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(Throwable cause) {
		super(cause);
	}
}

public class CustomExceptionConstructorsDemo {

	public static void main(String[] args) {

		try {
			throw new MyException("Custom message");
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
