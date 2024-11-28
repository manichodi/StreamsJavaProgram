package com.pak2;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {

		// how to use filter
		List<String> names = Arrays.asList("mani", "sai", "ganesh", "chaitanya", "money", "aaa", "abccb");
		names.stream().filter(e -> e.startsWith("a")).forEach(e -> System.out.println(e));

		// using filter with contains

		names.stream().filter(e -> e.contains("a")).forEach(e -> System.out.println(e));

		// uppercase
		names.stream().filter(e -> e.contains("e")).forEach(e -> System.out.println(e.toUpperCase()));

		// count
		System.out.println(names.stream().count());

	}

}
