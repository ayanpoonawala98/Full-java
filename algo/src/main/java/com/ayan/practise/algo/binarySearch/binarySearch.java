package com.ayan.practise.algo.binarySearch;

public class binarySearch {
	private int answer;
	private int[] a ;
	private int key;
	int p,len,q,r;
	public binarySearch(int[] a, int key) {
		super();
		this.answer = -1;
		this.a = a;
		this.len = a.length;
		this.key = key;
		this.p = 0;
		this.r = len-1;
		
		
	}
	
	public int binary() {
		
		while(p<=r) {
			q = (p+r)/2;
			if(a[q] == key) { return q;}
			else if(key < a[q]) { r = q-1;}
			else if(key > a[q]) {p = q+1;}			
		}
		return answer;
		
	}
}
