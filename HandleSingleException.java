package com.jsp.ExceptionHandling;

public class HandleSingleException {
	
	public static void main(String[] args) {
		
		int n=24;
		int m=0;
		
		try {
			int res=n/m;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
