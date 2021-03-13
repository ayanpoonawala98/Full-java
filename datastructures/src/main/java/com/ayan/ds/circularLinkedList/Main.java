
package com.ayan.ds.circularLinkedList;

public class Main {
	public static void main(String[] args) {
		circularLinkedList sl = new circularLinkedList();

		sl.insertFirst(90);
		
		sl.insertFirst(80);
		sl.insertFirst(70);
		sl.insertLast(100);
		sl.insertFirst(60);
		sl.insertFirst(10);
		
		sl.display();
	}


}
