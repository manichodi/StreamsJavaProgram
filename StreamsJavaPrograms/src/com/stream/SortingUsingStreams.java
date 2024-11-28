package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingUsingStreams {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("mani", "saikiran", "ganesh", "chaitanya", "saikumar", "naveen");

		// ascending order
		name.stream().sorted().forEach(e -> System.out.print(e + " "));
		System.out.println(" ");

		// descending order
		name.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));

	}

}
