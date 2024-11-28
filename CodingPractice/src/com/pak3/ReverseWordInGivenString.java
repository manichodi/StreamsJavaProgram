package com.pak3;

public class ReverseWordInGivenString {

	public static void main(String[] args) {
		
		String s="mani,kiran,kumar,ganesh,chaitanya";
		String op="";
		String arr[]=s.split(" ");
		for(String w:arr) {
			String rev=w;
			for(int i=w.length()-1;i>=0;i--) {
				System.out.println(rev.charAt(i));
			}
			System.out.println(" ");
		}
	}
}
