package com.lession.lession16.solution.exceptions.bmi;

public class InvalidHeightException extends Exception {
	public InvalidHeightException() {
		super("Height must be a value between 1 and 3.");
	}
}
