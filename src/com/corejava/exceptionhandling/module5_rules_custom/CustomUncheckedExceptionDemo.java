package com.corejava.exceptionhandling.module5_rules_custom;

@SuppressWarnings("serial")
/*
 * Demonstrates Custom Unchecked Exception
 */

class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class CustomUncheckedExceptionDemo {

	static void withdraw(double balance, double amount) {

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}

		System.out.println("Withdrawal successful");
	}

	public static void main(String[] args) {
		withdraw(1000, 2000);
	}
}
