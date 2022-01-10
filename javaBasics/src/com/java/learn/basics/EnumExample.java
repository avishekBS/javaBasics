package com.java.learn.basics;

public class EnumExample {

	public static void main(String[] args) {
		EnumDefine red = EnumDefine.RED;
		System.out.println("what is the name:"+red.name());
		System.out.println("what is the value:"+red.getValue());
	}

}
enum EnumDefine {
	
	RED("red"),
	GREEN("green"),
	BLUE("blue");

	private String value;

	EnumDefine(String value) {
		System.out.println("I am from constructor "+ value);
		this.value = value;
	}
	public String getValue(){
		return value;
	}
}
