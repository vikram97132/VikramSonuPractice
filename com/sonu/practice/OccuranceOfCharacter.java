package com.sonu.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		
		String name = "vikramsinghrajawat";
		
		Map<Character, Long> charCountMap = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(charCountMap);
		
		name.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

}
