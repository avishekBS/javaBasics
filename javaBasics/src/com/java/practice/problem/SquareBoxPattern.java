package com.java.practice.problem;

public class SquareBoxPattern {

	public static void main(String[] args) {
		int squareSize = 5;
		for (int i = 0; i <= squareSize; i++) {
			for (int j = 0; j <= squareSize; j++) {
				if(i==0 || i==squareSize || j==0 || j==squareSize)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
