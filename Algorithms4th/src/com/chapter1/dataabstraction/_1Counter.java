package com.chapter1.dataabstraction;

public class _1Counter {
	
	private String id;
	private int tally;

	public _1Counter(String id) {
		this.id = id;
	}
	
	public void increment() {
		tally++;
	}
	
	public int tally(){
		return tally;
	}
	
	@Override
	public String toString() {
		return "The counter "+ this.id + " = " +tally();
	}
}
