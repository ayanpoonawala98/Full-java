package com.ayan.practise.algo.linear;

public class linearSearch {
	
	private int[] a ;
	private int key;
	public int answer =-1;
	public int length;
	
	public linearSearch(int[] a, int key) {
		super();
		this.a = a;
		this.key = key;
		this.length = a.length;
	}
	
	public int search() {
		for (int i=0 ;i < length; i++) {
			if(a[i] == key) {
				answer = i;
				return answer;
			}
		}
		return -1;
	}
	

}
