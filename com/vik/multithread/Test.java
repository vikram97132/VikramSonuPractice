 package com.vik.multithread;

public class Test {

	public static void main(String[] args) {
		MyThread1 mythread = new MyThread1();
		
		//Thread t = new Thread(mythread);
		
		mythread.start();
		mythread.run();

	}

}
