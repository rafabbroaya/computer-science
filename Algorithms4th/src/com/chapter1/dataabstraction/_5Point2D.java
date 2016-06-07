package com.chapter1.dataabstraction;

import java.awt.Font;
import java.util.Scanner;

import com.stdlib.StdDraw;

public class _5Point2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		StdDraw.setPenRadius(0.01);
		StdDraw.setFont(new Font("SansSerif", Font.PLAIN, 12));

		double array[][] = new double[N][2];

		for (int i = 0; i < N; i++) {
			StdDraw.setPenColor((int) (Math.random() * 255), (int) (Math.random() * 255),
					(int) (Math.random() * 255));
			array[i][0] = Math.random();
			array[i][1] = Math.random();
			StdDraw.point(array[i][0], array[i][1]);
			StdDraw.text(array[i][0], array[i][1] + 0.02, "" + (i + 1));
		}

		double lessDistance = 1;
		Point point1 = null;
		Point point2 = null;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				double distance = Math.sqrt(Math.pow((array[j][0] - array[i][0]), 2)
						+ Math.pow((array[j][1] - array[i][1]), 2));
				if (distance < lessDistance) {
					lessDistance = distance;
					point1 = new Point(array[j][0], array[j][1]);
					point2 = new Point(array[i][0], array[i][1]);
				}
				System.out.printf(
						"point #%-3s (%.3f, %.3f) point #%-3s (%.3f, %.3f) distance: %f \n",
						(i + 1), array[i][0], array[i][1], (j + 1), array[j][0], array[j][1],
						distance);
			}
		}

		System.out.printf("Less distance: %f: \n", lessDistance);
		StdDraw.setPenRadius(0.003);
		StdDraw.line(point1.getX(), point1.getY(), point2.getX(), point2.getY());
		scanner.close();
	}
}

class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
