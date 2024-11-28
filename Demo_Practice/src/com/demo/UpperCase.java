package com.demo;

public class UpperCase {

	public static void main(String[] args) {

		String s = "manikanta saikiran saikumar ganesh voidcraft";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				String rev = arr[i].toUpperCase();
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
