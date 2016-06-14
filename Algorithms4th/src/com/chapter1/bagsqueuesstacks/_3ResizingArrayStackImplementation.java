package com.chapter1.bagsqueuesstacks;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

public class _3ResizingArrayStackImplementation<Item> implements _3ResizingArrayStack {

	private Item stack[]; // Stack of items
	private int N; // Number of items

	/**
	 * Create an empty stack of capacity cap
	 * 
	 * @param cap
	 */
	public _3ResizingArrayStackImplementation(int cap) {
		super();
		stack = (Item[]) new Object[cap];
	}

	@Override
	public void push(Object item) {
		if (N == stack.length)
			resize(stack.length * 2);
		stack[N++] = (Item) item;

	}

	@Override
	public Item pop() {
		Item item = stack[--N];
		this.stack[N] = null;
		if (N > 0 && N == stack.length / 4)
			resize(stack.length / 2);
		return item;
	}

	@Override
	public boolean isEmpty() {
		return this.N == 0;
	}

	@Override
	public int size() {
		return this.N;
	}

	@Override
	public void resize(int newMax) {
		Item tempStack[] = (Item[]) new Object[newMax];
		for (int i = 0; i < this.N; i++) {
			tempStack[i] = this.stack[i];
		}
		this.stack = tempStack;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	/**
	 * Support LIFO iteration.
	 * 
	 * @author rsanchez
	 *
	 */
	private class ReverseArrayIterator implements Iterator<Item> {

		private int i = N;

		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return stack[--i];
		}

		@Override
		public void remove() {
		}

	}

	// Test Client
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		_3ResizingArrayStack<String> stack = new _3ResizingArrayStackImplementation<String>(1);

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

		out.printf("\n%s", "Foreach:");
		for (String string : stack) {
			out.printf("\n%s ", string);
		}

		out.close();
	}

}

abstract interface _3ResizingArrayStack<Item> extends Iterable<Item> {

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

	/**
	 * Move the stack into an array of a different size
	 * 
	 * @param newMax
	 */
	public void resize(int newMax);
}
