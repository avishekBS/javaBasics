package com.java.learn.basics.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class InbuiltFunctionalInterfaces {
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(56, "Sribas", "Banik"),
				new Person(57, "Poushali", "Laskar"),
				new Person(58, "Saraswati", "Banik"),
				new Person(59, "Avishek", "Sribasbanikam"));
		
		System.out.println("=============Ascending order=================\n");
		//sort by first name ascending order
		Collections.sort(persons, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		persons.forEach(System.out::println);
		
		System.out.println("=============Descending order=================\n");
		//sort by lastName
		Collections.sort(persons, (o1, o2) -> o2.getFirstName().compareTo(o1.getFirstName()));
		persons.forEach(System.out::println);
		
		//add first name with lastname and print the output
		System.out.println("=============add first name with last name=================\n");
		printLamdaFUnction(persons, 
				person -> {
					String fullName = person.getFirstName().concat(" ").concat(person.getLastName());
					person.setFullName(fullName);
				},
				person -> System.out.println(person));
		//persons.forEach(System.out::println); -> rather make a 3rd args in consumer to print
	}

	private static void printLamdaFUnction(List<Person> persons, Consumer<Person> consume, Consumer<Person> consume2) {
		for (Person person : persons) {
			consume.accept(person);
			consume2.accept(person);
		}
	}

}
@Data
@AllArgsConstructor
@RequiredArgsConstructor
class Person{
	@NonNull
	private int id;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	private String fullName;
}
