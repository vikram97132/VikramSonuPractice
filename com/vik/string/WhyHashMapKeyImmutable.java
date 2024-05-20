package com.vik.string;

import java.util.HashMap;
import java.util.Map;

public class WhyHashMapKeyImmutable {
	public static void main(String[] args) {
		
		Map<Student , String> map =new HashMap();
		Student student1 = new Student("Anil");
		map.put(student1, "India");
		
		System.out.println(map.get(student1)); // output India , because weget value by passing key
		
		// now we can modify key as Student is mutable
		student1.setName("Akash");
		System.out.println(map.get(student1)); // null
		
	}

}
