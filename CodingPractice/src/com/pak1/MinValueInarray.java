package com.pak1;

import java.util.Arrays;
import java.util.List;

public class MinValueInarray {

	public static void main(String[] args) {
		
		//lowest value in array
		List<Integer> li = Arrays.asList(2,5,7,94,79,88,69);
		System.out.println(li.stream().sorted().findFirst());
		
		//2 lowest value in array
		
		System.out.println(li.stream().sorted().skip(1).findFirst());

	}

}
