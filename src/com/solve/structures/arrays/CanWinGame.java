package com.solve.structures.arrays;

public class CanWinGame {

	private String input;

	public CanWinGame(String input) {
		if(input == null || input.isEmpty()) {
			throw new IllegalArgumentException("Valid testcase file must be provided.");
		}
		this.input = input;
	}
}