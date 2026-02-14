package com.corejava.exceptionhandling.module6_common_exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates OutOfMemoryError.
 */
public class OutOfMemoryErrorDemo {

	public static void main(String[] args) {

		List<int[]> list = new ArrayList<>();

		while (true) {
			list.add(new int[1_000_000]);
		}
	}
}
