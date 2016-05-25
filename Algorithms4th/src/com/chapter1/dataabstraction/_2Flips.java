package com.chapter1.dataabstraction;

import com.stdlib.StdOut;
import com.stdlib.StdRandom;

public class _2Flips {

	public static _1Counter max(_1Counter x, _1Counter y) {
		if (x.tally() > y.tally())
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "10";
		int T = Integer.parseInt(args[0]);
		_1Counter heads = new _1Counter("heads");
		_1Counter tails = new _1Counter("tails");
		for (int i = 0; i < T; i++) {
			if (StdRandom.bernoulli(0.5))
				heads.increment();
			else
				tails.increment();
			StdOut.println(heads);
			StdOut.println(tails);
			int d = heads.tally() - tails.tally();
			StdOut.println("delta: " + Math.abs(d));

			if (heads.tally() == tails.tally())
				StdOut.println("Tie");
			else
				StdOut.println(max(heads, tails) + " wins");
		}
	}
}
