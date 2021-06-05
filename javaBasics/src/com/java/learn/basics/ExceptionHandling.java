package com.java.learn.basics;

/*
 * Declare your exception class using Throw new 
 * Throws will handle the exception
 * Try block should have catch or finally until java 1.7 using resource handling of io 
 * 
 */
class noZeroException extends Exception{
	
}
class NoMarriage extends Exception{
	public NoMarriage(String message) {
		super(message);
	}
}

public class ExceptionHandling {

	public static void main(String[] args) throws noZeroException {
		int k = 10/2;
		if (k == 0 ) {
			throw new noZeroException();
		}
		Boolean isMarried = true;
		if (isMarried) {
			try {
				throw new NoMarriage("Life sucks Bro!!");
			} catch (NoMarriage e) {
				System.out.println("Message::"+ e.getMessage());
			}
		}
	}

}
