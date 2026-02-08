package com.corejava.oops.module4_executionflow;

/**
 * Parent class for Instance Control Flow
 */
public class ParentInstance {

	int i = 10;

	{
		System.out.println("Parent Instance Block");
	}

	ParentInstance() {
		System.out.println("Parent Constructor");
	}
}