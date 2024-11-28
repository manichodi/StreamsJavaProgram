package com.pak1;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("mani", "sai", "ganesh", "chaitany");
		System.out.println(name.stream().count());

	}

}
