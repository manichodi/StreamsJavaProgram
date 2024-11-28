package com.pak3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice1 {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(3, 8, 65, 75, 34, 33, 69, 21);

		// lowest value in array
		System.out.println(li.stream().sorted().collect(Collectors.toList()));

		// highest value in array
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).findFirst());
		
		//2nd highest value in array
		System.out.println(li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

	}

}
