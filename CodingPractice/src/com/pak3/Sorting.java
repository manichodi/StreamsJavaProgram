package com.pak3;

public class Sorting {

	public static void main(String[] args) {
		
		int[] arr= {7,4,9,3,5,1,6};
		
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
