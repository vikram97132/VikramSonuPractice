package com.vik.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapLogicals {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap();
		map.put("Apple", 6);
		map.put("Dom", 4);
		map.put("Cattle", 9);
		map.put("Baby", 3);
		map.put("Elephant", 6);

		// Natrual sort as per value

		Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		
		// reversed sort
		 Map<String, Integer> reverseSortedMap = map.entrySet().stream()
		            .sorted(Map.Entry.comparingByValue(Collections.reverseOrder())) 
		            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		        
		
		
		// sort by length of key
		 Map<String, Integer> sortedByLength = map.entrySet().stream()
		            .sorted(Map.Entry.comparingByKey((s1, s2) -> Integer.compare(s1.length(), s2.length())))
		            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		        
		System.out.println(sortedByLength);
		
		 
	}

}
