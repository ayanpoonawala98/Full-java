package com.ayan.ds.singlylinklist;

public class Main {

	public static void main(String[] args) {
		singlyLinkedList sl = new singlyLinkedList();

		sl.insertFirst(90);
		
		sl.insertFirst(80);
		sl.insertFirst(70);
		sl.insertLast(100);
		sl.insertFirst(60);
		sl.insertFirst(10);
		
		sl.display();
	}

}
