package com.ayan.ds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		stack st = new stack(10);
	/*	st.push(10);
		st.push(40);
		st.push(50);
		st.push(42);
		st.push(78);
		st.push(79);
		st.push(26);
		st.push(40);
		st.push(79);
		
		while (!st.isEmpty()) {
			long value = st.pop();
			System.out.println(value);
		}
		//System.out.print(reverseCharachter("Hello"));
		Queue q = new Queue(10); //Queue
		q.insert(10);
		q.insert(15);
		q.insert(20);
		q.insert(30);
		q.insert(50);
		q.insert(75);
		q.insert(100);
		q.insert(105);
		q.insert(200);
		q.remove();
		System.out.print(q.peak());
		q.viewqueue();
		
		
		//System.out.println(view);
		
		*/
		
	Node node1 = new Node(); //Linked list
	node1.data = 3;
	
	Node node2 = new Node();
	node2.data = 5;
	
	Node node3 = new Node();
	node3.data = 7;
	
	Node node4 = new Node();
	node4.data = 6;
	
	node1.next = node2;
	node2.next = node3;
	node3.next = node4;
			
	
	System.out.println(listLength(node4));
		
		
	}
	
	public static int listLength(Node aNode) {
		int length = 0;
		Node currentNode = aNode;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static String reverseCharachter(String str) {
		int strSize = str.length(); 
		stack st = new stack(10);
		 
		 
		 for(int i=0;i<strSize;i++) {
			 st.push(str.charAt(i));
		 }
		 String result=""; 
		 while (!st.isEmpty()) {
				char value = (char) st.pop();
				result = result+value;
			}
		 return result;
	}
	
}
