package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSal {

	public static void main(String[] args) {
		
		List<Emp> empobj = Arrays.asList(new Emp(1, "mani", "it", 5000l),
				new Emp(2, "saikumar", "hr", 3000l),
				new Emp(3, "saikiran", "it", 1000l),
				new Emp(4, "ganesh", "admin", 4000l),
				new Emp(5, "chaitanya", "hr", 7000l),
				new Emp(6, "naveen", "admin", 8000l));
		
		 Optional<Emp> Sal=empobj.stream().sorted(Comparator.comparingLong(Emp::getSal).reversed()).skip(1).findFirst();
		
		System.out.println("SecondHighestSalary"+Sal.get().getName()+":"+Sal.get().getDept()+":"+Sal.get().getSal());
		
	}

}
