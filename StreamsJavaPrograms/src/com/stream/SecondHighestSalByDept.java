package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSalByDept {

	public static void main(String[] args) {

		List<Emp> empobj = Arrays.asList(new Emp(1, "mani", "it", 5000L),
				new Emp(2, "saikumar", "hr", 3000L),
				new Emp(3, "saikiran", "it", 1000L),
				new Emp(4, "ganesh", "admin", 4000L),
				new Emp(5, "chaitanya", "hr", 7000L),
				new Emp(6, "naveen", "admin", 8000L));

		Map<String, Optional<Emp>> obj = empobj.stream().collect(
				Collectors.groupingBy(Emp::getDept, Collectors.collectingAndThen(Collectors.toList(), list -> list
						.stream().sorted(Comparator.comparingLong(Emp::getSal).reversed()).skip(1).findFirst())));

		obj.forEach((dept, e) -> System.out
				.println(dept + ":" + e.get().getName() + ":" + e.get().getDept() + ":" + e.get().getSal()));

	}

}
