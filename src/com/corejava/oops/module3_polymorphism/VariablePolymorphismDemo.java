package com.corejava.oops.module3_polymorphism;

/**
 * Variable resolution based on reference type
 */
public class VariablePolymorphismDemo {

	public static void main(String[] args) {
		VariableParent p = new VariableChild();
		System.out.println(p.x); // 10
	}
}