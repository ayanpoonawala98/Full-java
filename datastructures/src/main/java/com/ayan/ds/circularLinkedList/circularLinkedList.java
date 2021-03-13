package com.ayan.ds.circularLinkedList;

import com.ayan.ds.singlylinklist.Node;

public class circularLinkedList {
	
	private Node first;
	private Node last;
	
	public circularLinkedList() {
		first = null;
		last = null;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void insertFirst(int j) {
		Node newNode =new Node();
		newNode.data = j;
		
		if(isEmpty()) {
			last = newNode;
			
		}
		
		newNode.next =first;
		first =newNode;
		
	}
	
	public void insertLast(int j) {
		Node newNode = new Node();
		newNode.data = j;
		
		if(isEmpty()) {
			first = newNode;
			
		}else {
			last.next= newNode;
			last = newNode;	
		}
		
		
	}
	
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) {
			last =null;
		}
		first =first.next;
		return temp;
	}
	
	 public void display() {
			System.out.println("List (first ---> Last)");
			Node current = first;
			while(current != null) {
				System.out.println("{" +current.data + " }");
				current =current.next;
			}
			
		 }
}
