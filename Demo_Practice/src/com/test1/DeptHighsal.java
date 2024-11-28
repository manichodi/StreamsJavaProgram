package com.test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.practice.Emp;

public class DeptHighsal {

	public static void main(String[] args) {
		
		List<Emp> data = Arrays.asList(new Emp(1, "mani", "IT", 1000L), new Emp(2, "saikiran", "TL", 2000L),
				new Emp(3, "ganesh", "admin", 3000L), new Emp(4, "saikumar", "HR", 3000L),
				new Emp(4, "chaithanya", "IT", 4000L));
		
//		Map<String, Optional<Emp>> dephigh = data.stream().collect(Collectors
//				.groupingBy(Emp::getDept,Collectors.maxBy
//						(Comparator.comparingLong(Emp :: getSal))));
//		
//		dephigh.forEach((dep,emp ) ->
//		System.out.println(dep  + " :: "+  emp.get().getName()+ " :: "+emp.get().getSal()));
		
		data.stream()
		.collect(Collectors.groupingBy(Emp::getDept,Collectors.maxBy(Comparator.comparingLong(Emp::getSal))))
		.forEach((dept,emp)->System.out.println(dept+":"+emp.get().getSal()));

		
	}

}
