package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondHighestNum {

	public static void main(String[] args) {
		
		//Second highest value
		List<Integer> num = Arrays.asList(45,89,64,76,87,99);
		System.out.println(num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

	}

}
