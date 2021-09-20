package com.java.learn.basics;

public class StringUsage {

	public static void main(String[] args) {
		
		//Immutable example with String literals
		String s1 = "Avishek";
		String s2 = "Avishek";
		System.out.println(s1);
		System.out.println(s2);
		if (s1 == s2)
			System.out.println("new String objects are same");
		else
			System.out.println("new String objects are not same since the == compares by refernce memory location");
		
		
		//new String
		String newS1 = new String("AVishek");
		String newS2 = new String("AVishek");
		System.out.println(newS1);
		System.out.println(newS2);
		if (newS1 == newS2)
			System.out.println("new String objects are same");
		else
			System.out.println("new String objects are not same since the == compares by refernce memory location");
	}

}
