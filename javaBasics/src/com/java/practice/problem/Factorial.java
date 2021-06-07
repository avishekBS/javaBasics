package com.java.practice.problem;

public class Factorial {
	static int  factorialNum = 5;
	static int value = 0;

	public static void main(String[] args) {
		new Factorial().factorialFn(factorialNum);
		System.out.println(value);
	}

	public void factorialFn(int num) {
		if (num == factorialNum)
			value = factorialNum;
		else{
			value *=num;
		}
		num-=1;
		if(num>=1)
			factorialFn(num);
	}
}
