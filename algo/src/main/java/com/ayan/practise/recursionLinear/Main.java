package com.ayan.practise.recursionLinear;

public class Main {

	public static void main(String[] args) {
		int j =binaryRe(new int[] {10,20,30,40,50,60},0,5,10);
		System.out.print(j);
	}
	
	public static int linearRecursion(int []a ,int i,int key) {
		
		if(i > a.length-1) {
			return -1;
		}else if(a[i] == key) {
			return i;
		}else {
			return linearRecursion(a,i+1,key);
		}
		
	}
	
	
	public static int binaryRe(int a[] ,int p ,int r ,int key) {
		System.out.println("[" + p + "..."+r +"]");
		if(p > r) return -1;
		else {
			int q = (p+r)/2;
			if(a[q] == key) return q;
			else if(key > a[q]) return binaryRe(a,q+1,r,key);
			else return binaryRe(a,p,q-1,key);
				
			
		}
	}

}
