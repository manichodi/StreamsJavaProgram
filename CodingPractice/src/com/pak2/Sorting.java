package com.pak2;

public class Sorting {

	public static void main(String[] args) {
			
			int[] arr= {4,3,9,6,1,2,8,7};
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]>=arr[j]) {
						arr[i]=arr[i]+arr[j];
						arr[j]=arr[i]-arr[j];
						arr[i]=arr[i]-arr[j];
					}
				}
			}
			for(int a: arr) {
				System.out.print(a);
			}

		}
	

}