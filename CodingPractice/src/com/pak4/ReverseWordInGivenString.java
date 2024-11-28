package com.pak4;

public class ReverseWordInGivenString {

	public static void main(String[] args) {
		
		String s="springBoot,springdi,springmvc,springioc";
		String op="";
		String[]arr=s.split(" ");
		for(String w: arr) {
			String rev=w;
			for(int i=w.length()-1;i>=0;i--) {
				System.out.print(rev.charAt(i));
			}
			System.out.println(" ");
		}
		
		

	}

}
