package com.ayan.ds.singlylinklist;

public class singlyLinkedList {
	 private Node first;
	public singlyLinkedList() {
		
	}
	
	public void insertFirst(int data) {
		
		Node newData = new Node();
		newData.data = data;
		newData.next = first;
		first = newData;
		
		
	}
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		 Node newNode = new Node();
		 newNode.data =data;
		 current.next = newNode;
		 //newNode.next =null;
		
	}
	 public Node deleteFirst() {
		 Node temp = first;
		 first = first.next;
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
	 public boolean isEmpty() {
		 return first == null;
	 }
	 
	 
	 
}
