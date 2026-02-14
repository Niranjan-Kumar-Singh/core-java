package com.corejava.exceptionhandling.module6_common_exceptions;

import java.util.Optional;

/**
 * Demonstrates defensive coding against NullPointerException.
 */
public class DefensiveNullHandlingDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String name = null;

		if (name != null) {
			System.out.println(name.length());
		} else {
			System.out.println("Name is null");
		}

		// Using Optional
		Optional<String> optional = Optional.ofNullable(name);
		System.out.println(optional.orElse("Default Value"));
	}
}
