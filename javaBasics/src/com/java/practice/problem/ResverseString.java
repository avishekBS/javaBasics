package com.java.practice.problem;

public class ResverseString {
	public static void main(String[] args) {
		String s1 = "Avishek";
		char[] charArray = s1.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
