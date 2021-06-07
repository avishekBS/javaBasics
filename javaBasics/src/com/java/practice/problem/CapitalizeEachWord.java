package com.java.practice.problem;

import java.util.StringTokenizer;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		String string = "hey! how are you";
		String captitazeString = null;
		StringTokenizer stringTokens = new StringTokenizer(string, " ");
		while (stringTokens.hasMoreTokens()) {
			String temString = stringTokens.nextToken();
			if (captitazeString == null)
				captitazeString = temString.substring(0, 1).toUpperCase() + temString.substring(1) + " ";
			else
				captitazeString += temString.substring(0, 1).toUpperCase() + temString.substring(1) + " ";
		}
		System.out.println(captitazeString.trim());

	}

}
