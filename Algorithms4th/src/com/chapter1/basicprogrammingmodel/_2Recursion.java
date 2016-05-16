package com.chapter1.basicprogrammingmodel;

public class _2Recursion {

	public static void decrease(int number) {
		if (number <= 0)
			return; // base case
		System.out.print(number + " ");
		decrease(--number); // smaller in some sense
	}

	public static void main(String[] args) {
		decrease(8);
	}
}
