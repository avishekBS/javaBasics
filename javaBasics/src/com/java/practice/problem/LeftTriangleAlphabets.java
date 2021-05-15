package com.java.practice.problem;

public class LeftTriangleAlphabets {
	public static void main(String[] args) {
		int size =5;
		for (int i = 65; i <= 65+size; i++) {
			for (int j = 65; j <= i; j++) {
				char alphabet = (char) j;
				System.out.print(alphabet);
			}
			System.out.println();
		}
	}
}
