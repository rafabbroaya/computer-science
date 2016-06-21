package com.chapter1.bagsqueuesstacks;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

public class _5QueueLinkedListImplementation<Item> extends Queue<Item> implements Iterable<Item>{

	private Node first;
	private Node last;
	private int N;

	private class Node<Item> {
		Item item;
		Node next;
	}

	@Override
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node<Item>();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}

		N++;
	}

	@Override
	public Item dequeue() {
		Node oldFirst = first;
		first = first.next;
		N--;
		if (isEmpty())
			last = null;
		return (Item) oldFirst.item;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public boolean isEmpty() {
		return (first == null);
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

	/**
	 * Test client
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		_5QueueLinkedListImplementation<String> queue = new _5QueueLinkedListImplementation<>();
		while (scanner.hasNext()) {
			String item = scanner.next();
			if (item.equals("-")) {
				if (!queue.isEmpty())
					out.print(queue.dequeue() + " ");
			} else {
				queue.enqueue(item);
			}
		}
		out.println("(" + queue.size() + " left on queue)");
		for (String string : queue) {
			out.println(string);
		}
		out.close();
		scanner.close();
	}

}

abstract class Queue<Item> {
	public abstract void enqueue(Item item);

	public abstract Item dequeue();

	public abstract int size();

	public abstract boolean isEmpty();
}
