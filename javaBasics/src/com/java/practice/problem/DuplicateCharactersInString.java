package com.java.practice.problem;

import java.util.LinkedHashMap;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		String string = "Avishek, is learning Java";
		LinkedHashMap<Character, Integer> chMap = new LinkedHashMap<>();
		for (char ch : string.toCharArray()) {
			if(!chMap.containsKey(ch))
				chMap.put(ch, 1);
			else
				chMap.put(ch, chMap.get(ch)+1);
		}
		chMap.entrySet().forEach(System.out::println);
	}
}
