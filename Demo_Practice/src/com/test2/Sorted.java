package com.test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Sorted {

	public static void main(String[] args) {
	
		List<Emp> data = Arrays.asList(new Emp(1,"mani","IT",3000L),
				new Emp(1,"sai","HR",9000L),
				new Emp(1,"kumar","Admin",7000L),
				new Emp(1,"ganesh","dev",4000L),
				new Emp(1,"chai","IT",6000L));
		
		Stream<Emp>Sorted = data.stream().sorted(Comparator.comparing(Emp::getName));
		
		Sorted.forEach(e->System.out.println(e.getName()+" "+e.getDept()+" "+e.getSal()));

	}

}
