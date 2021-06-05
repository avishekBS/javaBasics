package com.java.learn.basics.io;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n;
		try {
			n = scan.nextInt();
			System.out.println("Enter number is "+ n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
