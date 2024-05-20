package com.vik.intrface;

public class BankWorking {
	public static void main(String[] args) {
		
		RBIFunctionalInterf sbi = new SBI();
		sbi.deposit();
		sbi.withdraw();
		sbi.linkAadhar();
		sbi.minBal();
		
		
		RBIFunctionalInterf axis = new Axis();
		axis.deposit();
		axis.withdraw();
		axis.linkAadhar();
		axis.minBal();
	}

}
