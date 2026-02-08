package com.corejava.oops.module1_core;

/**
 * Account class demonstrates DATA HIDING.
 *
 * Data Hiding is achieved by declaring data members as private
 * and providing controlled access through public methods.
 */
class Account {

    // private data member (hidden from outside world)
    private double balance = 5000.0;

    /**
     * Provides controlled access to balance.
     * Validation / security checks can be added here.
     */
    public double getBalance() {
        return balance;
    }
}