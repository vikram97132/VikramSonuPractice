package com.sonu.practice;

public class PrimeNo {

	public static void main(String[] args) {

		int x = 17;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {

				System.out.println(x + " is not a prime number");
				break;
			} else {
				System.out.println(x + " is a prime number");
				break;
			}
		}

	}
}
