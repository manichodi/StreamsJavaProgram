package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderUsingNumber {

	public static void main(String[] args) {
		
		
		List<Integer> num = Arrays.asList(37,53,78,34,96,68,19,54);
		//reverse order
		num.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
		System.out.println(" ");
		
		//sorting order
		num.stream().sorted().forEach(e->System.out.print(e+" "));
		

	}

}
