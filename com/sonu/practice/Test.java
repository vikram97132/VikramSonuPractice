package com.sonu.practice;

public class Test {
	public static void main(String[] args) {

		String name = "Vikram Singh Rajawat";

		long count = name.chars().filter(c -> c != ' ').count();

		System.out.println(count);

	}

}
