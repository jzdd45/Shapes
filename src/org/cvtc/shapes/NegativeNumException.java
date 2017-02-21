package org.cvtc.shapes;

// A custom exception for handling numbers less than 0. 
public class NegativeNumException extends Exception {

	private static final long serialVersionUID = -3966048059969669473L;
	
	// The message the exception will return if called.
	public NegativeNumException() {
		super("Error: Please enter a positive number.");
	}
	
}
