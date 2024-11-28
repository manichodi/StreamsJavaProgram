package com.pak3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("mani","sai","ganesh","chaitanya","abc","apple");
		names.stream().filter(e->e.contains("a")).forEach(e->System.out.println(e.toUpperCase()));
		
		System.out.println(names.stream().count());

	}

}
