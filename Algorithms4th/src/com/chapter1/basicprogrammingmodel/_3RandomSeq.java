package com.chapter1.basicprogrammingmodel;

import java.io.PrintWriter;
import java.util.Locale;

//import com.stdlib.StdOut;
import com.stdlib.StdRandom;

public class _3RandomSeq {
	

	public static void main(String[] args) { // Print N random values in (lo, hi).
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(args[0]);
		double lo = Double.parseDouble(args[1]);
		double hi = Double.parseDouble(args[2]);
		for (int i = 0; i < N; i++) {
			double x = StdRandom.uniform(lo, hi);
			//StdOut.printf("%.2f\n", x);
			out.printf("hola\n");
			out.printf(Locale.US,"%2f\n", x);
			
		}
		
		out.printf("PI is approximately %.2f\n", Math.PI);
		out.printf("%-20.2ebase of natural logarithms\n", Math.E);
		out.printf("%20.5s","Hello, world");
		out.flush();
	}
}
