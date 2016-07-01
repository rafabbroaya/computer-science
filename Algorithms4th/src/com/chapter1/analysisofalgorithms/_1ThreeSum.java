package com.chapter1.analysisofalgorithms;

import com.stdlib.In;
import com.stdlib.StdOut;
import com.stdlib.StdRandom;

public class _1ThreeSum {
	public static int count(int[] a) { // Count triples that sum to 0.
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				for (int k = j + 1; k < N; k++)
					if (a[i] + a[j] + a[k] == 0)
						cnt++;
		return cnt;
	}

	public static double timeTrial(int N) { // Time ThreeSum.count() for N
											// random 6-digit ints.
		int MAX = 1000000;
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		_2StopWatch timer = new _2StopWatch();
		int cnt = _1ThreeSum.count(a);
		return timer.elapsedTime();
	}

	public static void main(String[] args) {
//		int N = Integer.parseInt(args[0]);
//		int[] a = new int[N];
//		for (int i = 0; i < N; i++)
//			a[i] = StdRandom.uniform(-1000000, 1000000);
//		_2StopWatch timer = new _2StopWatch();
//		int cnt = _1ThreeSum.count(a);
//		double time = timer.elapsedTime();
//		StdOut.println(cnt + " triples " + time + "seconds");
		
		for (int N = 1; true; N += N)
		{ // Print time for problem size N.
		double time = timeTrial(N);
		StdOut.printf("%7d %5.1f\n", N, time);
		}
	}
}
