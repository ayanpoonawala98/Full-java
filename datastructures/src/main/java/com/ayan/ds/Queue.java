package com.ayan.ds;

public class Queue {
	
	private int maxSize;
	private long queue[];
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize=size;
		this.queue= new long[size];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	public void insert(int j) {
		if(!isfull()) {
		rear++;
		queue[rear] =j;
		nItems++;
		}else {
			System.out.println("Queue is Full");
		}
		
		
	}
	public long remove() {
		if(!isEmpty()) {
		long temp = queue[front];
		front++;
		if(front == maxSize) {
			front=0;
		}
		nItems--;
		return temp;
		}
		else {
			System.out.println("The queue is Empty");
			return -1;
		}
	}
	
	 public void viewqueue() {
		 System.out.print("[ ");
		 for(int i=front;i<= rear;i++) {
			 System.out.print(queue[i] + " ");
		 }
		 System.out.print("]");
	 }

	 public long peak() {
		 return queue[front];
	 }
	 
	 public boolean isfull() {
		 return nItems == maxSize;
	 }
	 
	 public boolean isEmpty() {
		 return nItems ==0;
	 }
}

