package com.java.practice.problem;

//(3*3*3 + 7*7*7 + 1*1*1) == 371
public class ArmStrongNumber {
	int number = 371;
	public static void main(String[] args) {
		System.out.println(new ArmStrongNumber().isArmStrongNumber());
		
	}
	public boolean isArmStrongNumber(){
		int value = 0;
		if(number != 0) {
			String num = String.valueOf(number);
			for (int i = 0; i < num.length(); i++) {
				int digit = Integer.valueOf(String.valueOf(num.charAt(i)));
				value += Math.pow(digit, num.length());
			}
			if(value == number)
				return true;
		}
		return false;
		
	}

}
