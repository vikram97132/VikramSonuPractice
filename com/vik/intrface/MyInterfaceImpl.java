package com.vik.intrface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void abstractMethod() {
		
		System.out.println("abstract method from impl");
	}
	@Override
	public  void defaultMethod() {
		System.out.println("default methof from impl");
	}
	public static void staticMethod() {
		System.out.println("static method from impl");
		// And its not Overridden method from MyInterface because for static method it not possible 
		// actualy its method hiding concept
	}
	
	public static void main(String[] args) {
		new MyInterfaceImpl().abstractMethod();
		new MyInterfaceImpl().defaultMethod();
		new MyInterfaceImpl().staticMethod();
		MyInterface.staticMethod();
	}

}
