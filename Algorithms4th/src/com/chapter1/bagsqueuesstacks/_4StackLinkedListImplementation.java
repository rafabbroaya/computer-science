package com.chapter1.bagsqueuesstacks;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

public class _4StackLinkedListImplementation<Item> extends Stack<Item> implements Iterable<Item> {

	private Node first; // Top of stack (Most recently added node)
	private int N; // number of items

	/**
	 * Nested class to define nodes
	 * 
	 * @author rsanchez
	 *
	 * @param <Item>
	 */
	private class Node<Item> {
		Item item;
		Node next;
	}

	private class ListIterator implements Iterator<Item> {

		Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = (Item) current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}

	@Override
	public void push(Item item) {
		Node oldFirst = this.first;
		this.first = new Node();
		this.first.item = item;
		this.first.next = oldFirst;
		N++;
	}

	@Override
	public Item pop() {
		Item item = (Item) this.first.item;
		this.first = this.first.next;
		N--;
		return item;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Test client
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		_4StackLinkedListImplementation<String> stack = new _4StackLinkedListImplementation<>();
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while (scanner.hasNext()) {
			String item = scanner.next();
			if (item.equals("-")) {
				if (!stack.isEmpty())
					out.print(stack.pop() + " ");
			} else {
				stack.push(item);
			}
		}
		out.println("(" + stack.size() + " left on stack)");
		for (String string : stack) {
			out.println(string);
		}
		out.close();
		scanner.close();
	}
}

abstract class Stack<Item> {

	/**
	 * Add item to top of stack
	 * 
	 * @param item
	 */
	public abstract void push(Item item);

	/**
	 * Remove item from top of stack
	 * 
	 * @return
	 */
	public abstract Item pop();

	public abstract int size();

	public abstract boolean isEmpty();
}
