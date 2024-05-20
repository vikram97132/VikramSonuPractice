package com.vik.string;

public class TestObject {
	public static void main(String[] args) {
		
		String s1 = new String("vikram").intern();
		String s2 = "vikram";
		
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		
	}

}
