package com.pak2;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		
		String s="mani sai ganesh chaithanya";
		String op=" ";
		String[] arr=s.split(" ");
		for(String w: arr) {
			String rev=w;
				for(int i=w.length()-1;i>=0;i--) {
					System.out.print(rev.charAt(i));
				}
				System.out.print(" ");
		}
		
	}
}	
