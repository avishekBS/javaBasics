package com.java.practice.problem;

import java.util.Iterator;

/*
 *       *
 *       **
 *       ***
 *       ****
 */
public class RightTrainglePattern {

	public static void main(String[] args) {
		int size = 10;
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= j-i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
