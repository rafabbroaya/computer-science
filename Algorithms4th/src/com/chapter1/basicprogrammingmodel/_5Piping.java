package com.chapter1.basicprogrammingmodel;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author rsanchez
 * java com.chapter1.basicprogrammingmodel._5Piping | java com.chapter1.basicprogrammingmodel.Pipe2
 * java com.chapter1.basicprogrammingmodel._5Piping pipe3 | java com.chapter1.basicprogrammingmodel.Pipe3
 */
public class _5Piping {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		PrintWriter out = new PrintWriter(System.out);
		try {
			String param0 = args[0];
			if (param0.equalsIgnoreCase("pipe3")) {
				for (int i = 0; i < 5; i++) {
					Double score = scanner.nextDouble();
					out.printf("%f\n", score);
					out.flush();
				}
			}
			scanner.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			name = scanner.nextLine();
			out.printf("%s", name);
			out.flush();
			scanner.close();
		}

	}
}

class Pipe1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
	}
}

class Pipe2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double score = scanner.nextDouble();
		System.out.println(score);
		scanner.close();
	}
}

class Pipe3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		double sum = 0;
		while(scanner.hasNext()) {
			count++;
			Double score = scanner.nextDouble();
			sum = sum + score;
			System.out.println("Score #"+ count+ " " + score);
		}
		System.out.println("Average " + sum/count);
		scanner.close();
	}
}
