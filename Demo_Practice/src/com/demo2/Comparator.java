package com.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.practice.Emp;
public class Comparator {

	public static void main(String[] args) {

		List<Emp> empobj = Arrays.asList(new Emp(1, "mani", "IT", 1000L), new Emp(2, "saikiran", "TL", 2000L),
				new Emp(3, "ganesh", "admin", 3000L), new Emp(4, "saikumar", "HR", 3000L),
				new Emp(4, "chaithanya", "IT", 4000L));

		Optional<Emp> highestEmp = empobj.stream().max(java.util.Comparator.comparingLong(Emp::getSal));

		System.out.println(highestEmp.get().getName() + ":" + highestEmp.get().getSal());

	}

	


}
