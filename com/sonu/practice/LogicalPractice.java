package com.sonu.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogicalPractice {
	public static void main(String[]args) {
		
		List<Integer> number =Arrays.asList(1,2,3,4,5,6,7,8,9);
		
	
		
		
		
		List<Integer> multiple = number.stream().map(num->num*2).collect(Collectors.toList());
		System.out.println(multiple);
	}

}
