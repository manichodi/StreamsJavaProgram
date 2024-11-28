package com.demo;

public class Practice {

	public static void main(String[] args) {
	String w = "hi this is mani";// 0     1    2   3
	String[] arr = w.split(" ");// {hi ,this ,is ,mani}
	String op="";
//	System.out.println(arr.length);
//	System.out.println(w.length());
	for(int i =0;i<arr.length;i++) {
		String ar = arr[i];//this
		for(int j = ar.length()-1;j>=0;j--) {
			op+= ar.charAt(j);// ar.charAt(0); hi
		}
		op+=" ";
	}
	System.out.println(op);//ih siht 
	}

}