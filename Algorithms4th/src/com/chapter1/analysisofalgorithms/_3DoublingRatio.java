package com.chapter1.analysisofalgorithms;

import java.io.PrintWriter;

import com.stdlib.StdRandom;

public class _3DoublingRatio {
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

	// same as for DoublingTest (page 177)
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		double prev = timeTrial(125);
		for (int N = 250; true; N += N) {
			double time = timeTrial(N);

			

			out.printf("%6d %7.1f ", N, time);
			out.printf("%5.1f\n", time / prev);
			out.flush();
			prev = time;
		}
		
		// 250    0,0   6,0
		// 500    0,0   7,5
		// 1000   0,3   7,7
		// 2000   2,8   7,9
		// 4000   21,9  7,9
		// 8000   174,5 8,0
		// prediction
		// 16000  = (174.5 * 8.0) = 1396
		

	}
}
