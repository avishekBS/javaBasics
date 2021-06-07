package com.java.practice.problem;

public class IsPalindrome {

	//string rever and string are same then palindrome
	public static void main(String[] args) {
		String language = "malayalam";
		if(language.equals(new StringBuilder(language).reverse().toString()))
			System.out.println("Yes it is palindorme");
		else
			System.out.println("not a palindrome");

	}

}
