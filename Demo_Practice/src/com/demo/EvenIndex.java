package com.demo;

public class EvenIndex {

public static void main(String[] args) {
		
		String s = "springboot springdi springmvc spring springioc";
		String[] arr = s.split(" ");
		// int i = arr.length;
		String re = " ";

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				String rev = arr[i];
				for (int j = rev.length() - 1; j >= 0; j--) {

					System.out.print(rev.charAt(j));
				}
				System.out.print(" ");

			} else {

				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
	}
}
