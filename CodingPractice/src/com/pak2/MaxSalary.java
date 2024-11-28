package com.pak2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalary {

	public static void main(String[] args) {
		
		List<Emp> empobj = Arrays.asList(new Emp(1,"mani","it",30000l),
				new Emp(1,"saikiran","HR",20000l),
				new Emp(1,"saikuamr","it",40000l),
				new Emp(1,"ganesh","it",10000l),
				new Emp(1,"chaitanya","it",60000l));
		
//		Optional<Emp>HighestEmp = empobj.stream().max(Comparator.comparingLong(Emp::getSalary));
//		
//		System.out.println(HighestEmp.get().getName()+":"+HighestEmp.get().getSalary()+"-"+HighestEmp.get().getDept());
		empobj.stream()
		.collect(Collectors.groupingBy(Emp::getDept,Collectors.maxBy(Comparator.comparingLong(Emp::getSalary))))
		.forEach((dept,emp)->System.out.println(dept+":"+emp.get().getSalary()));

	}

}
