package com.corejava.oops.module1_core;

/**
 * Test class for Data Hiding concept.
 */
public class DataHidingDemo {

    public static void main(String[] args) {

        Account acc = new Account();

        // Direct access is NOT allowed
        // System.out.println(acc.balance);
        // ❌ Compile-Time Error: balance has private access in Account

        // Accessing data through public method
        System.out.println("Account Balance: " + acc.getBalance());
    }
}