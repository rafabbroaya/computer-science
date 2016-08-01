package com.chapter1.unionfind;

import java.io.PrintWriter;
import java.util.Scanner;

public class UFTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = scanner.nextInt();
		UF uf = new UFImpl(N);

		while (scanner.hasNextInt()) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			// System.out.println("p: " + p + " q: " + q);
			if (uf.connected(p, q))
				continue;
			uf.union(p, q);
			out.println(p + " " + q);
		}
		
		out.print(uf.count() + " components");
		scanner.close();
		out.close();
	}
}
