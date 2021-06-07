package com.java.learn.basics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Using comparator. 
 * Compartor is a functional interface so we can use lamda expression.
 */
public class ArrayListSortComparator {
	public static void main(String[] args) {
		new ArrayListSortComparator().comparatorInteger();
		new ArrayListSortComparator().comparatorString();
	}
	//String way to use comparator
	private void comparatorString() {
		List<String> values = new ArrayList();
		values.add("Ravi");
		values.add("Radhe");
		values.add("Raman");
		values.add("Avishek");
		values.add("Poushali");
		
		//for ascending order o1.compareTo(o2) --> usually sort(values) for wrapper class 
		//but I have user comparater as an example for Obj uderdefined.
		Collections.sort(values, (o1, o2) -> o2.compareTo(o1));
		values.forEach(System.out::println);
		
	}
	private void comparatorInteger() {
		List<Integer> values = new ArrayList();
		values.add(777);
		values.add(808);
		values.add(923);
		values.add(927);
		Comparator<Integer> comparatorASC = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1%10 > o2%10)? 1:-1;
			}
		};
		Collections.sort(values, comparatorASC);
		System.out.println("ascending:"+ values);
		
		/*
		 * Using Lamda expresion
		 */
		Comparator<Integer> comparatorDesc = (o1, o2) ->(o1%10 > o2%10)? -1:1;
		Collections.sort(values, comparatorDesc);
		System.out.println("descending:"+ values);
	}
}
