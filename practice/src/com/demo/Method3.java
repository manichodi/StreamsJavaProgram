package com.demo;
// returning the value & pass the parameter at same time

public class Method3 {
	public int add(int x,int y) {
		int z=x+y;
		return z;
	}
	public static void main(String[] args) {
		Method3 obj = new Method3();
		int z =obj.add(60, 40);
		System.out.println(z);
	}
	

}
