package com.pak4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalaryDetails {

	public static void main(String[] args) {
		// max salary
		
		List<Emp> data = Arrays.asList(new Emp(1,"mani","IT",4000l),
				new Emp(1,"sai","HR",4000l),
				new Emp(1,"kiran","IT",2000l),
				new Emp(1,"ganesh","admin",8000l),
				new Emp(1,"chai","dev",4000l));
		
		Optional<Emp>HighestEmp = data.stream().max(Comparator.comparingLong(Emp::getSal));
		
		System.out.println(HighestEmp.get().getDept()+":"+HighestEmp.get().getSal());
		
		data.stream()
		.collect(Collectors.groupingBy(Emp::getDept,Collectors.maxBy(Comparator.comparingLong(Emp::getSal))))
		.forEach((dept,emp)->System.out.println(dept+":"+emp.get().getSal()));
		
		Stream<Emp>Sorted=data.stream().sorted(Comparator.comparingLong(Emp::getSal));
		Sorted.forEach(e->System.out.println(e.getName()+":"+e.getDept()+":"+e.getSal()));

	}

}
