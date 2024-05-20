package com.sonu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedWord {
	
	public static void main(String[] args) {
		
		String str = "i am am learning java java only";
		
		List<String> words = Arrays.asList(str.split(" "));
		
		
		Map<Object, Object> hm = words.stream().collect(Collectors.groupingBy(Function.identity()
				,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
		System.out.println(hm);
		
		//join whole string in one word
		
		
		String singleWord = str.replaceAll("\\s+", "");
		System.out.println(singleWord);
		System.out.println(str.replaceAll(" ", "_"));
		
	
	}

}
