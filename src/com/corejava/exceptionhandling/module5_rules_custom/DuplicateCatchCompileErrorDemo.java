package com.corejava.exceptionhandling.module5_rules_custom;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * Demonstrates:
 * Rule 4: Duplicate Catch Block
 */

public class DuplicateCatchCompileErrorDemo {

	public static void main(String[] args) {

		try {
			// This may throw FileNotFoundException (subclass of IOException)
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream fis = new FileInputStream("abc.txt");
		}

		catch (IOException e) {
			System.out.println("First catch");
		}
		
		/*
		 * Compile-Time Error Example (Do NOT uncomment together)
		 * 
		 * catch (IOException e) {
		 *		System.out.println("Second catch");
		 *	}
		 */
	}
}
