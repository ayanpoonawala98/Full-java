package com.ayan.learning.adt;

public class Main {

	public static void main(String[] args) {

		Counter mycount = new Counter("ayan");
		mycount.increment();
		mycount.increment();
		mycount.increment();
		mycount.increment();
		mycount.increment();
		
		mycount.increment();
		mycount.increment();
		mycount.increment();
		mycount.increment();
		
		System.out.println(mycount.getCurrentValue());
		System.out.println(mycount.toString());
		
	}

}
