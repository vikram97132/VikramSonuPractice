package com.sonu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("ashok", "manish", "nilm", "mohan", "praveen");

		// Longest string
		String longest = names.stream().max((s1, s2) -> s1.length() - s2.length()).orElse(null);

		// Smallest String
		String smallest = names.stream().min((s1, s2) -> s1.length() - s2.length()).orElse(null);

		// length of all String
		Map<String, Integer> lengthsMap = names.stream().collect(Collectors.toMap(n -> n, String::length));

		// average of all string
		Double avrg = names.stream().collect(Collectors.averagingDouble(String::length));

		// starts with or ends with
		List<String> n = names.stream().filter(e -> e.endsWith("n")).collect(Collectors.toList());

		// sort string in dictinory order
		List<String> sortedNames = new ArrayList<>(names); // Creating a new list to keep the original intact
		sortedNames.sort(String::compareTo);

		// vowel count in all string
		String vowel = "aeiouAEIOU";
		String allNames = names.stream().collect(Collectors.joining());
		List<Character> vowelCharacter = new ArrayList();
		for(int i=0; i<allNames.length();i++) {
			Character ch = allNames.charAt(i);
			if(vowel.indexOf(ch)!=-1) {
				vowelCharacter.add(ch);
			}
		}
		System.out.println(vowelCharacter +"   & total count is : " + vowelCharacter.size());
		
	List<String> naam = Arrays.asList("Vikram"  ," Singh", " Rajawat");
	String fullName = naam.stream().collect(Collectors.joining());
		long count =	fullName.chars().filter(c->c!=' ').count();
	System.out.println(fullName   + " =  "  +count);
	}

}
