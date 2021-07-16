package com.learning.jersey.learningJerseyTwo.exception;

public class MessageNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5123829814642268606L;

	public MessageNotFoundException(String message) {
		super(message);
	}
}
