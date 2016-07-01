package com.chapter1.analysisofalgorithms;

public class _2StopWatch {

	private final long start;

	public _2StopWatch() {
		start = System.currentTimeMillis();
	}

	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}

}
