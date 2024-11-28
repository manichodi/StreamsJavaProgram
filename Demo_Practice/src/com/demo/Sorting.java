package com.demo;

public class Sorting {

	public static void main(String[] args) {

		int[] arr = { 4,8,6,3,1 }; // 1,3,4,5,6,8,9

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] >= arr[j]) {  //0 >=1
					arr[i] = arr[j] + arr[i];//i=1+0=1;
					arr[j] = arr[i] - arr[j];//j=
					arr[i] = arr[i] - arr[j];
				}
			}
		}

		for (int a : arr) {
			System.out.print(a);
		}

	}

}
