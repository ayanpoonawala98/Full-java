package com.ayan.learning.adt;

public class Counter {
	private int count=0;
	private String name;
	
	private void setCount() {
		System.out.println("Hello World");
	}
	public Counter(String str) {
		this.name= str;
	}
	
	public void increment() {
		count +=1;
	}
	 public int getCurrentValue() {
		 
		 return count;
	 }
	 public String toString() {
		 
		 String s  = name + " Count is "+count;
		 return s;
	 }
	 
}
