package com.java.learn.basics.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashsetCustomeDatatype {
	Set<Chocolate> chocolates = new HashSet<Chocolate>( Arrays.asList(new Chocolate(75, 10), 
			new Chocolate(45, 70),
			new Chocolate(75, 10),
			new Chocolate(45, 70)));
	public static void main(String[] args) {
		HashsetCustomeDatatype obj = new HashsetCustomeDatatype();
			obj.chocolates.forEach(System.out::println);
	}
	
}
class Chocolate{
	private int cocoa;
	private int sugar;
	
	public Chocolate(int cocoa, int sugar) {
		this.cocoa = cocoa;
		this.sugar = sugar;
	}
	public int getCocoa() {
		return cocoa;
	}
	public void setCocoa(int cocoa) {
		this.cocoa = cocoa;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	@Override
	public String toString() {
		return "Chocolate [cocoa=" + cocoa + ", sugar=" + sugar + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return cocoa;
	}
	@Override
	public boolean equals(Object obj) {
		 if (obj == null) return false;
		    if (!(obj instanceof Chocolate))
		        return false;
		    if (obj == this)
		        return true;
		    return this.cocoa == ((Chocolate) obj).cocoa  && this.sugar == ((Chocolate) obj).sugar;
	}
}