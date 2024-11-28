package com.stream;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {
		
		
		//Count of elements
		List<String> names = Arrays.asList("mani","saikiran","saikumar","ganesh","chaitanya","naveen");
		
		System.out.println("count of elements:"+names.stream().count());
	}

}
