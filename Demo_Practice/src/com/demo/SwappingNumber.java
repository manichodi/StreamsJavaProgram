package com.demo;

public class SwappingNumber {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = 30;
		// output= 20,30,10
		
		x = x + y;
		y = x-y;
		x=x-y;
		y=x+y;
		z=y-x;
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);

	}

}
