package com.ayan.practise.algo.linear;

public class Main {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,40};
		linearSearch ls = new linearSearch(a,40);
		int answer =ls.search();
		if(answer != -1) {
			System.out.println("The key is at position " + answer);
		}else {
			System.out.println("The key not Found");
		}
		
		//System.out.println(answer);

	}

}
