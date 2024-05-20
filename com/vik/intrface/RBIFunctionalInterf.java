package com.vik.intrface;

public interface RBIFunctionalInterf {
	public abstract void deposit();
	public abstract void withdraw();
	
	// suppose after some years RBi introduces two new method ,
	// but don't want to disturb running bank functaniolity, we here go for default methods 
	
	public default void linkAadhar() {
		System.out.println("Contact your bank to link aadhar");
	}
	public default void minBal() {
		System.out.println("Contact your bank to know the min Balance");
	}

}
