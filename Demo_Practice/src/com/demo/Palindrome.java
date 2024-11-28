package com.demo;

public class Palindrome {

	public static void main(String[] args) {
		String s = "abcbcaabcd";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				boolean value = isPalindrome(s.substring(i, j));
				if (value) {
					System.out.println(s.substring(i, j));
					count++;
				}
			}
		}

		System.out.println(count);
	}

	static boolean isPalindrome(String s) {

		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.reverse();
		String s1 = sb.toString();

		if (s1.equals(s) && s1.length() >= 2) {
			return true;
		}
		return false;
	}
}
