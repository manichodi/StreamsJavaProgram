package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingUsingEmpSal {

	public static void main(String[] args) {

		List<Emp> empobj = Arrays.asList(new Emp(1, "mani", "it", 5000L),
				new Emp(2, "saikumar", "hr", 3000L),
				new Emp(3, "saikiran", "tester", 1000L),
				new Emp(4, "ganesh", "admin", 4000L),
				new Emp(5, "chaitanya", "developer", 7000L),
				new Emp(6, "naveen", "jnrdev", 8000L));
		
		//sorting order
		empobj.stream().sorted(Comparator.comparingLong(Emp::getSal))
				.forEach(e -> System.out.println(e.getName() + ":" + e.getDept() + ":" + e.getSal()));
		

	}

}
