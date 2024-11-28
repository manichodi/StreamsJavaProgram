package com.pak4;

public class SortingNumbers {

	public static void main(String[] args) {
		
		int[] arr = {7,4,6,3,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
					
				}	
			}
			}
		for(int a:arr) {
			System.out.print(a);
		}

	}

}
