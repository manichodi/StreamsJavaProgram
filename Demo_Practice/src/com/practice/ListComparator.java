package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ListComparator {

	public static void main(String[] args) {
		
		List<Emp> empobj = Arrays.asList(new Emp(1, "nag", "it", 2000L), new Emp(2, "nihal", "it", 3000L),
				new Emp(3, "mani", "it", 2000L), new Emp(4, "rishi", "HR", 4000L), new Emp(5, "nihan", "Admin", 2000L),
				new Emp(5, "siri", "HR", 2000L));
		

		Optional<Emp> highestEmp = empobj.stream().max(Comparator.comparingLong(Emp::getSal));

		 System.out.println(highestEmp.get().getName() + ":" +
		 highestEmp.get().getSal());

//		Map<String, Optional<Emp>> dephigh = empobj.stream()
//				.collect(Collectors.groupingBy(Emp::getDept, Collectors.maxBy(Comparator.comparingLong(Emp::getSal))));
//
//		dephigh.forEach((dep, emp) ->
//
//		System.out.println(dep + ": " + ":" + emp.get().getName() + ":" + emp.get().getSal()));

	}

}
