package com.corejava.oops.module4_constructors;

/**
 * Demonstrates Singleton class using private constructor.
 */
class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}

public class SingletonClassDemo {
	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1 == s2); // true
	}
}