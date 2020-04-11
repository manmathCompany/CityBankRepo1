package com.mn.test;

import com.mn.beans.Utility;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			Utility u=new Utility();
			
		
			System.out.println(u.sysDate());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
