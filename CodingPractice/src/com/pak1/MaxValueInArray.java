package com.pak1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxValueInArray {

	public static void main(String[] args) {

		//highest value in array
		List<Integer> li = Arrays.asList(2,5,7,94,79,88,69);
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).findFirst());
		
		//2 highest value in array
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

	}

}
