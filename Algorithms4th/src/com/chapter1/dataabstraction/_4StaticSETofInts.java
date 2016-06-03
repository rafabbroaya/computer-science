package com.chapter1.dataabstraction;

import java.util.Arrays;
import java.util.Scanner;

public class _4StaticSETofInts {

	private int a[];

	public _4StaticSETofInts(int[] a) {
		this.a = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			this.a[i] = a[i]; // defensive copy
		}

		Arrays.sort(this.a);
	}

	boolean contains(int key) {
		return rank(key) != -1;
	}

	private int rank(int key) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			System.out.println("lo: " + lo + " hi: " + hi);

			int mid = lo + (hi - lo) / 2;

			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}
	// 14
	// 10 12 13 15 18 23 33 43 43 200 0-9
	// 10 12 13 15 0-3
	// 13 15 2-3
	// 15 3-3
	// 3-2

}

class WhiteList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int keys[] = { 10, 12, 15, 18, 13, 200, 33, 43, 43, 23 };
		_4StaticSETofInts staticSETofInts = new _4StaticSETofInts(keys);

		while (scanner.hasNextInt()) {
			int key = scanner.nextInt();
			if (key == 0)
				break;
			System.out.println("Contains " + key + ": " + staticSETofInts.contains(key));
		}

		scanner.close();
		System.out.printf("%s\n", "Bye");
	}
}