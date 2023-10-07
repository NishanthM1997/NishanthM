package com.sample;

public class UnreachableBlock {

	public static void main(String[] args) {
		
		try {
			  int b=7/0;
		  }catch (Exception e) {
			  System.out.println("The exception is handled");
		  }catch (ArithmeticException b) {
			  b.printStackTrace();
		  }


	}
}
