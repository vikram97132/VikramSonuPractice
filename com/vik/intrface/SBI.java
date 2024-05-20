package com.vik.intrface;

public class SBI implements RBIFunctionalInterf{

	@Override
	public void deposit() {
		System.out.println("SBI deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI withraw");
		
	}
	public void linkAadhar() {
		System.out.println("Your aadhar is linked Successfully");
	}
	public void minBal() {
		System.out.println("min balance amount is Rs. 1000/-");
	}

}
