package com.demo;

public class Method2 {
	public void add(int x, int y) {
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Method2 obj = new Method2();
		obj.add(99, 999);
	}

}
