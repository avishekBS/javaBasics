package com.java.learn.basics.exception;

public class ReturnFinallyBlock {
	
	public static void main(String[] args) {
		ReturnFinallyBlock obj = new ReturnFinallyBlock();
		String value0 = obj.getValue(0);
		String value1 = obj.getValue(1);
		System.out.println(value0);
		System.out.println(value1);
	}
	
	private String getValue(int value) {
		try {
			if (value ==0)
				throw new Exception();
			else
				return "from try block";
		}
		catch (Exception e) {
			return "from catch block";
		}
		finally {
			return "from finally block";
		}
	}

}
