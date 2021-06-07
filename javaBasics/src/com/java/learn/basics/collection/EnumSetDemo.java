package com.java.learn.basics.collection;

import java.util.EnumSet;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetDemo {
	public static void main(String[] args) {
		EnumSet<days> set = EnumSet.of(days.MONDAY, days.WEDNESDAY);
		set.forEach(System.out::println);
		System.out.println("**************all days *********");
		set = EnumSet.allOf(days.class);
		set.forEach(System.out::println);
		System.out.println("**************Range *********");
		set = EnumSet.range(days.MONDAY, days.THURSDAY);
		set.forEach(System.out::println);
	}
}
