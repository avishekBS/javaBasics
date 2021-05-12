package com.java.learn.basics;

public class SwitchOperation {
	
	public static void main(String[] args) {
		/*
		 * Switch doesnt works with Boolean and double
		 * Switch works with String from java 1.8
		 */
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		   default:
		    break;
		}
	}

}
