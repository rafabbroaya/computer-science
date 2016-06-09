package com.chapter1.bagsqueuesstacks;

import java.io.PrintWriter;
import java.util.Scanner;

public class _1FixedCapacityStackOfStringsImplementation implements _1FixedCapacityStackOfStrings {

	private String stack[];
	private int size;

	/**
	 * Create an empty stack of capacity cap
	 * 
	 * @param cap
	 */
	public _1FixedCapacityStackOfStringsImplementation(int cap) {
		super();
		stack = new String[cap];
	}

	@Override
	public void push(String item) {
		stack[this.size++] = item;
	}

	@Override
	public String pop() {
		if (isEmpty())
			return "Empty";
		return stack[--this.size];
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		String stackString = "";
		for (int i = 0; i < this.size; i++) {
			stackString += stack[i] + " ";
		}
		return stackString;
	}

	// Test Client
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		_1FixedCapacityStackOfStrings stack = new _1FixedCapacityStackOfStringsImplementation(100);

		while (scanner.hasNext()) {
			String token = scanner.next();
			if (!token.equals("-")) {
				stack.push(token);
			} else {
				out.printf("%s ", stack.pop());
			}
		}
		out.printf("(%d left on stack)", stack.size());

		scanner.close();
		out.close();
	}

}

abstract interface _1FixedCapacityStackOfStrings {

	/**
	 * Add a String in the stack
	 * 
	 * @param item
	 */
	public void push(String item);

	/**
	 * Remove the most recently added string from the stack
	 * 
	 * @return
	 */
	public String pop();

	/**
	 * Return if the stack is empty or no
	 * 
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * Number of strings in the stack
	 * 
	 * @return
	 */
	public int size();

}
