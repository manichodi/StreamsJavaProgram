package com.demo;

public class PracticeDemo {

	public static void main(String[] args) {
		
		int[] arr = {4,7,6,9,3,2,1};
		
		for(int i=1;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>= arr[j]){
					arr[i]=arr[j]+arr[i];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];				
					}
			
			}
		}
		for (int a : arr){
			System.out.print(a);
		
		}

	}

}
