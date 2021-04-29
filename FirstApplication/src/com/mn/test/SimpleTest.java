package com.mn.test;

public class SimpleTest extends Thread{

	@Override
	public void run() {
		
		System.out.println("from simple test run method");
	}
	
	public static void main(String[] args) {
		
		Thread t=new SimpleTest();
		
		t.start();
	}
}
