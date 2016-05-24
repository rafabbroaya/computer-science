package com.chapter1.basicprogrammingmodel;

import java.io.PrintWriter;

import com.stdlib.StdOut;

public class _7Exercises {

	public static void _1() {
		System.out.println(2.0e-6 * 100000000.1);
	}

	public static void _2() {
		System.out.println(1 + 2 + 4.0);
		System.out.println(1 + 2 + "3");

	}

	public static void _6() {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
	}

	public static void _8() {
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));
	}

	public static void _9(int n) {
		String binary = "";
		while (n >= 1) {
			binary = (n % 2) + binary;
			n /= 2;
		}
		System.out.println(binary);
	}

	public static void _12() {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		// 9 8 7 6 5 4 3 2 1 0
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		// 0 1 2 3 4 4 3 2 1 0
		for (int i = 0; i < 10; i++)
			System.out.println(a[i]);
	}

	public static void _13(/* rows */int M, /* columns */int N, PrintWriter out) {
		// Transposition
		int matrix[][] = new int[M][N];
		int transposition[][] = new int[N][M];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
				out.printf("%-4d", matrix[i][j]);
			}
			out.print("\n");
		}

		out.print("\n");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				transposition[i][j] = matrix[j][i];
				out.printf("%-4d", transposition[i][j]);
			}
			out.print("\n");
		}

		out.print("\n");

	}

	public static int _18(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return _18(a + a, b / 2);
		return _18(a + a, b / 2) + a;
	}

	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	public static void FNew(int N) {
		int fibo[] = new int[N];
		fibo[0] = 0;
		fibo[1] = 1;
		System.out.println(fibo[0]);
		System.out.println(fibo[1]);
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			System.out.println(fibo[i]);
		}
	}

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		// _1();
		// _2();
		// _6();
		// _8();
		// _9(6);
		// _12();
		// _13(5, 3, out);
		// out.print(_18(3, 11));
		// for (int N = 0; N < 4; N++)
		// out.println(N + " " + F(N));

		FNew(10);

		out.flush();
	}
}
