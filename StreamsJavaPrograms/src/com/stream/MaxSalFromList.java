package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxSalFromList {

	public static void main(String[] args) {

		List<Emp> empSalary = Arrays.asList(new Emp(1, "mani", "it", 5000L), new Emp(2, "saikumar", "hr", 3000L),
				new Emp(3, "saikiran", "it", 1000L),
				new Emp(4, "ganesh", "admin", 4000L),
				new Emp(5, "chaitanya", "hr", 7000L), 
				new Emp(6, "naveen", "admin", 8000L));

		Optional<Emp> HighestSal = empSalary.stream().max(Comparator.comparingLong(Emp::getSal));
		System.out.println("HighestSal" +":" +HighestSal.get().getName() + ":" + HighestSal.get().getDept() + ":"
				+ HighestSal.get().getSal());

	}

}
