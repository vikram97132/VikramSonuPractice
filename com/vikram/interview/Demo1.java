package com.vikram.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// entry set example/ HashMap iteration
public class Demo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();

		map.put("Anil", 5000);
		map.put("Mohan", 6000);
		map.put("Aksah", 7000);
		
		// map.entrySet().stream().filter(e->e.getValue()>5000)
			//	.map(Map.Entry :: getKey).forEach(System.out::println);

		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			if (entry.getValue()>=6000)
					 {
				System.out.println(entry.getKey());
			}
		}

	}
}
