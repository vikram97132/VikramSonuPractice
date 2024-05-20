package com.vik.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList();
		
		list.add("sanjay");
		list.add("ashok");
		list.add("som");
		list.add("gyanendra");
		
		// sort by length of string
		Comparator<String> lengthOfString = Comparator.comparingInt(String::length);
		Collections.sort(list , lengthOfString);
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
