package com.pak2;

import java.util.Arrays;
import java.util.List;

import com.pak1.Emp;

public class Practice {

	public static void main(String[] args) {
		
		List<Emp> empobj = Arrays.asList(new Emp(1, "mani", "it", 5000l),
				new Emp(2, "saikumar", "hr", 3000l),
				new Emp(3, "saikiran", "it", 1000l),
				new Emp(4, "ganesh", "admin", 4000l),
				new Emp(5, "chaitanya", "hr", 7000l),
				new Emp(6, "naveen", "admin", 8000l));
		
		empobj.stream().filter(e->e.getSalary()>=5000).
		forEach(e->System.out.println(e.getName()+":"+e.getDept()+":"+e.getSalary()));
		
		Map<String, Optional<Emp>> secondHighestByDept = empobj.stream()
	            .collect(Collectors.groupingBy(
	                Emp::getDept, // Group by department
	                Collectors.collectingAndThen(
	                    Collectors.toList(),
	                    list -> list.stream()
	                        .sorted(Comparator.comparingInt(Emp::getSal).reversed()) // Sort by salary descending
	                        .skip(1) // Skip the highest
	                        .findFirst() // Second highest
	                )
	            ));

	        // Print the results
	 secondHighestByDept.forEach((dept, empOpt) -> {
            System.out.println(dept + ": " + empOpt.map(emp -> emp.getName() + " " + emp.getSal()).orElse("No second-highest salary"));
        });

	}

}
