package com.chapter1.bagsqueuesstacks;

import java.io.PrintWriter;
import java.util.Scanner;

public class _2FixedCapacityStackImplementation<Item> implements _2FixedCapacityStack {

	private Item stack[];
	private int size;

	/**
	 * Create an empty stack of capacity cap
	 * 
	 * @param cap
	 */
	public _2FixedCapacityStackImplementation(int cap) {
		super();
		stack = (Item[]) new Object[cap];
	}

	@Override
	public void push(Object item) {
		stack[size++] = (Item) item;

	}

	@Override
	public Item pop() {
		return stack[--size];
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int size() {
		return this.size;
	}

	// Test Client
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		_2FixedCapacityStack<String> stack = new _2FixedCapacityStackImplementation<String>(100);

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

abstract interface _2FixedCapacityStack<Item> {

	/**
	 * Add a Item in the stack
	 * 
	 * @param item
	 */
	public void push(Item item);

	/**
	 * Remove the most recently item added
	 * 
	 * @return
	 */
	public Item pop();

	/**
	 * Return if the stack is empty or no
	 * 
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * Number of items in the stack
	 * 
	 * @return
	 */
	public int size();
}
