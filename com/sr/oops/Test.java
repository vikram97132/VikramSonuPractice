package com.sr.oops;

public class Test {
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer arreg");
		
	}
  public void m1(String s) {
	  System.out.println("String version");
	  
  }
  public static void main() {
	  
  Test t =new Test();
  t.m1("a");
  t.m1("durga");
  }
}
