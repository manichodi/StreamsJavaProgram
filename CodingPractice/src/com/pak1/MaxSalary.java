package com.pak1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalary {

	public static void main(String[] args) {

		List<Emp> empobj = Arrays.asList(new Emp(1, "mani", "it", 5000l),
				new Emp(2, "saikumar", "hr", 3000l),
				new Emp(3, "saikiran", "it", 1000l),
				new Emp(4, "ganesh", "admin", 4000l),
				new Emp(5, "chaitanya", "hr", 7000l),
				new Emp(6, "naveen", "admin", 8000l));

//        Optional<Emp>HighestEmp = empobj.stream().min(Comparator.comparingLong(Emp :: getSalary));
//
//        System.out.println("HigehstSalary-" +HighestEmp.get().getName()+":"+HighestEmp.get().getSalary());
//	empobj.stream()
//    .collect(Collectors.groupingBy(Emp::getDept,Collectors.maxBy(Comparator.comparingLong(Emp::getSalary))))
//    .forEach((name,emp)->System.out.println(name+":"+emp.get().getSalary()));

//		empobj.stream().filter(e -> e.getSalary() >= 5000L)
//				.forEach(e -> System.out.println(e.getName() + ":" + e.getSalary()));

		Optional<Long>Highestsal = empobj.stream().map(Emp::getSalary).distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst();
		
		Highestsal.ifPresent(salary->System.out.println("Second Highest salary"+":"+salary));
		
//		Map<String, Long>salary=empobj.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.mapping(Emp::getSalary,Collectors.toSet())))
//				.entrySet().stream()
//				.collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().stream()
//						.sorted(Comparator.reverseOrder())
//						.skip(1)
//						.findFirst()
//				    	.orElse((long) 1.1)
//						));
		
		
	}

}
