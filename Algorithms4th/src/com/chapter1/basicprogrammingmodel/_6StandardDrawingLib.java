package com.chapter1.basicprogrammingmodel;

import com.stdlib.StdDraw;

public class _6StandardDrawingLib {

	public static void main(String[] args) {
		
		int N = 100;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N * N);
		StdDraw.setPenRadius(.01);

		for (int i = 0; i < N; i++) {

			StdDraw.point(i, i);
			StdDraw.point(i, i * i);
			StdDraw.point(i, Math.log(i));
		}
	}
}
