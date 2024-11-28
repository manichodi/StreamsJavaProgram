package com.demo;

public class MethodDemo {
	
	public int add() {
		int x=10;
		int y=20;
		int z=x+y;
		return z;
		
	}
	public void addition() {
		//int x = 10;
		//int y = 20;
		int z = add();
		System.out.println(z);
		int a = 30;
		int b = z + a;
		
		System.out.println(b);
	}
	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		obj.addition();
	}

}
