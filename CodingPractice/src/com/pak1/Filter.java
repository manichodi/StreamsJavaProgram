package com.pak1;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		//filter()
		List<String> name = Arrays.asList("mani","sai","abc","aabc");
		name.stream().filter(e->e.startsWith("a")).forEach(e->System.out.println(e));
		
		//using filter by contains method
		name.stream().filter(e->e.contains("a")).forEach(e->System.out.println(e));
		
		//print in Uppercase
		name.stream().filter(e->e.contains("a")).forEach(e->System.out.println(e.toUpperCase()));
		
		

	}

}
