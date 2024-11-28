package com.pak3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Details {

	public static void main(String[] args) {
		
		List<Emp> empobj = Arrays.asList(new Emp(1,"mani","IT",3000l),
				new Emp(1,"mani","Dev",3000l),
				new Emp(1,"mani","Admin",3000l),
				new Emp(1,"mani","IT",5000l),
				new Emp(1,"mani","HR",3000l));
		
		Optional<Emp>HighestEmp = empobj.stream().max(Comparator.comparingLong(Emp::getSal));
		System.out.println(HighestEmp.get().getDept()+":"+HighestEmp.get().getSal());
		
		empobj.stream()
		.collect(Collectors.groupingBy(Emp::getDept,Collectors.maxBy(Comparator.comparingLong(Emp::getSal))))
		.forEach((dept,emp)->System.out.println(dept+":"+emp.get().getSal()));

	}

}

