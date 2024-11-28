package com.pak1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderInArray {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(3,6,8,1,7,9,5);
		li.stream().sorted().forEach(e->System.out.print(e));
		System.out.println(" ");
		
		// Reverse order 
		li.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e));
		

	}

}
