package com.java.learn.basics;

public class VariableLengthArgs {

	class Calc{
		public void add(int...    num) {
			int sum = 0;
			for (int i : num) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		VariableLengthArgs.Calc  calc = new VariableLengthArgs().new Calc();
		calc.add(1, 2, 3, 4);
	}

}
