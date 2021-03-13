package com.ayan.ds.doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		doublyLL dl = new doublyLL();
		dl.insertFirst(22);
		dl.insertFirst(12);
		dl.insertFirst(55);
		dl.insertLast(90);
		dl.insertAfter(55, 25);
		dl.deleteFirst();
		dl.deleteKey(90);
		dl.display();
		dl.reversedisplay();

	}

}
