package com.java.practice.problem;

public class Fibonacci {
	int n1 = 0;
	int n2 = 1;

	public static void main(String[] args) {
		new Fibonacci().printFibonacciNormal(10);
		new Fibonacci().printFibonacciRecursive(10);

	}

	public void printFibonacciRecursive(int count) {
		if (count==10) {
			System.out.print(n1 + " " + n2);
			count -=2;
		}
		else {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		count -=1;
		if (count >=0) {
			printFibonacciRecursive(count);
		}
	}

	public void printFibonacciNormal(int count) {
		System.out.println("*******Make Fibonacci series normal way******");
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2);
		for (int i = 0; i < count - 2; i++) {
			int n3 = num1 + num2;
			System.out.print(" " + n3);
			num1 = num2;
			num2 = n3;
		}
		System.out.println("\n***********END**********");
	}
}