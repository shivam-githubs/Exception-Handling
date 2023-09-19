package com.jsp.ExceptionHandling;

public class ThrowsException {

	//	throws keyword - used to declare an Exception to be thrown to the caller
		
		public static void main(String[] args) throws 
			ArithmeticException, StringIndexOutOfBoundsException {
			
			int n=24; int m=10; String s ="";
			
			System.out.println(n/m);
			System.out.println(s.charAt(5));
		
	}
}

