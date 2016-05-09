package com.chapter1;

/**
 * Compute GCD (greatest common divisor) of two non negative integers p and q as
 * follows: If q is 0, then answer is p. If not, divide p by q and take the
 * reminder r. The answer is the GCD of q and r.
 * 
 * @author rafael
 *
 */
public class EuclidsAlgorithm {

	public static int GCD(int p, int q) {
		int r = 0;
		if (q == 0)
			return p;
		r = p % q;
		return GCD(q, r);

	}

	public static void main(String[] args) {
		System.out.print(GCD(121, 11));
	}
}
