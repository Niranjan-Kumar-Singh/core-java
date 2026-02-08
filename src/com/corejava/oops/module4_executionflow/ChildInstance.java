package com.corejava.oops.module4_executionflow;

/**
 * Child class instance flow demo
 */
public class ChildInstance extends ParentInstance {

	int x = 100;

	{
		System.out.println("Child Instance Block");
	}

	ChildInstance() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		new ChildInstance();
	}
}