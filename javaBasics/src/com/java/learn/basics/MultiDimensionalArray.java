package com.java.learn.basics;

import java.util.Iterator;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] multiDimen = {
				{1, 2, 3},
				{4, 5, 6, 7},
				{7, 8, 9}
		};
		for (int i = 0; i < multiDimen.length; i++) {
			int rowSize = multiDimen[i].length; //jagged Arrays - find the 1st row and pulls the size
			for (int j = 0; j < multiDimen[i].length; j++) {
				System.out.print(multiDimen[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < multiDimen.length; i++) {
			System.out.println("");
		}
		
		//Enhanced for Loop for 2D array
		for (int[] is : multiDimen) {
			for (int num : is) {
				System.out.print(num +" ");
			}
			System.out.println("");
		}
	}

}
