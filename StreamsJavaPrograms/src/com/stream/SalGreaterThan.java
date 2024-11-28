package com.stream;

import java.util.Arrays;
import java.util.List;

public class SalGreaterThan {

	public static void main(String[] args) {
		
		List<Emp> salary = Arrays.asList(new Emp(1, "mani", "it", 5000L),
				new Emp(2, "saikumar", "hr", 3000L),
				new Emp(3, "saikiran", "it", 6000L),
				new Emp(4, "ganesh", "admin", 4000L),
				new Emp(5, "chaitanya", "hr", 7000L),
				new Emp(6, "naveen", "admin", 8000L));
		
		salary.stream().filter(e->e.getSal()>=5000L)
		.forEach(e->System.out.println(e.getName()+":"+e.getDept()+":"+e.getSal()));

	}

}
