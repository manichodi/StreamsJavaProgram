package com.pak1;

public class Sorting {

	public static void main(String[] args) {

		int[] arr = { 3, 6, 2, 4, 9, 7 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] >= arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];

				}
			}
		}
		for (int a : arr) {
			System.out.print(a);
			System.out.print(" ");
		}

	}

}
