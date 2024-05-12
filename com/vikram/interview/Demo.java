package com.vikram.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {

		String str = "sanjaysingh";

		// case 1 Convert all to upper case
		String newStr = str.toUpperCase();
		

		// case 2 count occurance of chharacter
		Map<Character, Long> occurance = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		

		// case 3 find first non repeated character
		Character firstNonRepChar = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList()).get(0);
		

		// case 4 concatenate each character of the string with a prefix "Char: "
		char[] ch = str.toCharArray();
		for (char c : ch) {
			System.out.println("Char :" + c);
		}

		// case 5 Remove duplicate characters from the string

		List<Character> distint = str.chars().mapToObj(e -> (char) e).distinct().collect(Collectors.toList());
		

		// case 6 Split the string into substrings based on a delimiter
		String name = "sanjay,singh,is,leaving,today";

		Stream<String> substringStream = Arrays.stream(str.split(","));
		substringStream.forEach(System.out::println);

		// case 7 Check if the string contains only alphabetic characters using Java 8
		// streams.

		System.out.println(str.chars().allMatch(Character::isLetter));

		// case 8 Reverse the string using Java 8 streams.
		String reverse = new StringBuilder(str).reverse().toString();
		

		// Sort the characters of the string alphabetically using Java 8 streams

		System.out.println(str.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList()));

		String str1 = "vikram@#&45%";
		// check weather contains special character or not

		boolean s = str1.chars().anyMatch(chn -> !Character.isLetterOrDigit(chn));
		
		

		// remove special character
		char[] c = str1.toCharArray();
		List<Character> nonSpecial = new ArrayList();
		List<Character> special = new ArrayList();
		for (Character ch1 : c) {
			if (!Character.isLetter(ch1)) {
				special.remove(ch1);
			} else {
				nonSpecial.add(ch1);
			}
		}
		System.out.println("nonSpecial " + nonSpecial);

	}
}
