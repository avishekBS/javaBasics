package com.java.learn.basics;

public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		while (i<=5) {
			System.out.println("value of i:"+i);
			i++;
		}
		
		do {
			System.out.println("atleast execute once. when i=="+i);
			i++;
		} while (i<=7);
	}
}
