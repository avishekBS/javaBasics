package com.java.learn.basics.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamJava8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(56, "Sribas", "Banik"),
				new Person(57, "Poushali", "Laskar"),
				new Person(58, "Saraswati", "Banik"),
				new Person(59, "Avishek", "Sribasbanikam"));
		
		System.out.println("====================foreach=================");
		persons.forEach(System.out::println);
		
		System.out.println("====================stream=================");
		persons.stream()
			.filter(person -> person.getFirstName().startsWith("S"))
			.forEach(System.out::println);
	}

}
