package com.java.learn.basics;

public class Operators 
{
	/*
	 * Arithemetic + , - , * , / , %
	 */
	public static void main(String[] args) {
		int num1 = 10, num2 = 3;
		int div1 = num1/ num2;
		double div2 = num1/ num2;
		double div3 = (double) num1/ num2;
		int mod = num1 % num2;
		System.out.println("int datatype variable for div gives only quotient: "+ div1);
		System.out.println("double datatype variable for div gives only quotient with decimal: "+ div2);
		System.out.println("cast double datatype variable for div gives the actual division value: "+ div3);
		System.out.println("modulus gives int value reminder: "+ mod);
		
		/*
		 * Short hand operator
		 */
		num1+=num2; //num1 = num1 +num2
		System.out.println("add num1+=num2 and store to num1:"+num1);
		num2+=1;
		System.out.println("add num2+=1 and store to num1:"+num2);
		num2++;
		System.out.println("add num2++ increment num2:"+num2);
		
		/*
		 * Diff between ++num1 & num1++  --> Both provide the same output.
		 * ---> Pre-Increment (++num2) & Post increment(num2++)
		 */
		System.out.println("value of num2:"+num2);
		int temp = num2++;
		System.out.println("value of temp:"+temp + " Value of num2:"+num2 + " Value of num2 incremented after assigning to temp.");
		
		temp=0;
		temp = ++num2;
		System.out.println("value of temp:"+temp + " Value of num2:"+num2 + " Value of num2 incremented and then assigned to temp.");
	}
}
