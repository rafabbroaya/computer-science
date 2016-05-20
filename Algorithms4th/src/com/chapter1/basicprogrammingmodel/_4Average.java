package com.chapter1.basicprogrammingmodel;

import java.io.PrintWriter;
import java.util.Scanner;

public class _4Average {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String input = scanner.nextLine();
		out.printf("Hello %s\n", input);
		int count = 0;
		double sum = 0.0;
		while (scanner.hasNext()) {
			sum = sum + scanner.nextDouble();
			count++;
			if (sum > 100)
				break;
		}
		out.printf("Score average %f\n", sum / count);
		out.flush();
		scanner.close();
	}
}
