package com.java.learn.basics;

public class ThisKeyword {
	
	public static void main(String[] args) {
		ThisKeyword thisKeyword = new ThisKeyword();
		thisKeyword.show();
	}

	private void show() {
		System.out.println(this);
	}

}
