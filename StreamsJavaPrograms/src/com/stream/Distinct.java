package com.stream;

import java.util.Arrays;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {

		//distinct
		List<String> names = Arrays.asList("mani","sai","sai","mani","ganesh");
		
		names.stream().distinct().forEach(e->System.out.println(e));
		
	}	

}
