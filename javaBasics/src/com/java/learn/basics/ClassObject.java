package com.java.learn.basics;

class Calc{
	int num1;
	int num2;
	int result;
	public void perform() {
		result =  num1 +num2;
	}
}
public class ClassObject {
	public static void main(String[] args) {
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		calc1.num1 = 5;
		calc1.num2 = 6;
		calc2.num1 = 10;
		calc2.num2 = 10;
		calc1.perform();
		calc2.perform();
		System.out.println("calc1 obj result:"+calc1.result);
		System.out.println("calc1 obj result:"+calc2.result);
		
	}
}
