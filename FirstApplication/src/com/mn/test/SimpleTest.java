package com.mn.test;

public class SimpleTest extends Thread{

	@Override
	public void run() {
		System.out.println("run method start");
		
		System.out.println("run method stop");
	}
	
	public static void main(String[] args) {
		
		Thread t=new SimpleTest();
		
		t.start();
	}
}
