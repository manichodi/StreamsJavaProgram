package com.pak2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighLowValueInArray {

	public static void main(String[] args) {

		// lowest value in array
		List<Integer> li = Arrays.asList(3, 5, 4, 98, 34, 68);
		System.out.println(li.stream().sorted().findFirst());

		// highest value in array
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).findFirst());

		// 2 highest value in array
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

		// Sorting order in array
		li.stream().sorted().forEach(e -> System.out.print(e));
		System.out.println(" ");

		// Reverse order in array
		li.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e));

	}

}
