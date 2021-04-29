package com.mn.test;

public class SimpleTest extends Thread{

	@Override
	public void run() {

                for(int i=0;i<=5;i++){
                System.out.println("hi manmath");
		
		}
		
		System.out.println("from simple test run method");
	}
	
	public static void main(String[] args) {
		
		Thread t=new SimpleTest();
		
		t.start();
	}
}
