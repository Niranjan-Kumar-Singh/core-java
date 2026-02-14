package com.corejava.exceptionhandling.module5_compiletime_custom;

@SuppressWarnings("serial")
/*
 * Real-world layered example
 */

class InsufficientBalanceEx extends RuntimeException {
	public InsufficientBalanceEx(String message) {
		super(message);
	}
}

class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new InsufficientBalanceEx("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Remaining balance: " + balance);
	}
}

public class BankingLayeredExampleDemo {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(1000);
		account.withdraw(1500);
	}
}