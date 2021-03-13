package com.ayan.ds.doublyLinkedList;

import com.ayan.ds.doublyLinkedList.Node;

public class doublyLL {
	
	private Node first;
	private Node last;
	
	public doublyLL() {
		this.first=null;
		this.last = null;
		
	}
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}else {
			first.previous = newNode;
		}
		
		newNode.next = first;
		first = newNode; 
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data ;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode;
			newNode.previous = last;
		}
		newNode.next = null;
		this.last = newNode;
	}
	
	//assume non-empty list 
	
	public Node deleteFirst() {
		Node temp = first;
		
		if( first.next == null) {
			last = null;
			
		}else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	public Node deleteLast() {
		Node temp = last ;
		
		if ( first.next == null) {
			first = null;
		}else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	
	public boolean insertAfter(int key , int data) {
		
		Node newNode =new Node();
		newNode.data = data;
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
			
		}
		if(current == last) {
			current.next = null;
			
		}else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		current.next = newNode;
		newNode.previous = current;
		return true;
		
	}
	 public Node deleteKey(int key) {
		 Node temp = first;
		 Node current = first;
		 
		 while(current.data != key) {
			 current = current.next;
			 if(current == null) {
				 return null;
			 }
			 
		 }
		 if(current == first) {
			 first = current.next;
			 current.next.previous =null;
		 }else {
			 current.previous.next = current.next;
		 }
		 
		 if(current == last) {
			 last = current.previous;
			 current.previous.next = null;
		 }else {
			 current.next.previous = current.previous;
		 }
		 return current;
	 }
	 public void display() {
			System.out.println("List (first ---> Last)");
			Node current = first;
			while(current != null) {
				System.out.println("{" +current.data + " }");
				current =current.next;
			}
			
		 }
	 public void reversedisplay() {
			System.out.println("List (last ---> first)");
			Node current = last;
			while(current != null) {
				System.out.println("{" +current.data + " }");
				current =current.previous;
			}
			
		 }
}
