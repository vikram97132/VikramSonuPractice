  package com.sonu.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfString {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("sanjay", "joy", "mohansingh", "vikramsinghrajawat");

		// length of each string
		Map<String, Integer> map = new HashMap();
		for (String name : names) {

			map.put(name, name.length());
		}
       // reverse string
		String name = "vikramsinghrajawat";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		
		// replace target 'a' with 'z'
		String str = "sanjayrana";
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a') {
				result.append('z');
			}else {
				result.append(c);
			}
			
		}
		System.out.println(result.toString());
		
		
	}

}
