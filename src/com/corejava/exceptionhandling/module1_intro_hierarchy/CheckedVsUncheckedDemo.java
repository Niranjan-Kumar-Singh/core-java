package com.corejava.exceptionhandling.module1_intro_hierarchy;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * This program demonstrates:
 * 1. Unchecked exception
 * 2. Checked exception handling
 */
public class CheckedVsUncheckedDemo {

	public static void main(String[] args) {

		// Unchecked exception (compiler does not force handling)
		System.out.println(10 / 0);

		// Checked exception (compiler forces handling)
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			fis.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
