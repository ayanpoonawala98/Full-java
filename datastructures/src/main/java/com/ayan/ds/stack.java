package com.ayan.ds;

public class stack {
	
	private int top;
	private char[] stack;
	private int max_size;
	
	public stack(int size) {
		super();
		this.top = -1;
		this.max_size = size;
		this.stack = new char[size];
		
	}
	
	public void push(char j) {
		if(!isFull()) {
			top++;
			stack[top]=j;
		}else {
			System.out.println("Stack is Full");
		}
		
		
	}
	
	public int pop() {
		if(!isEmpty()) {
		int old_top = top;
		top--;
		return stack[old_top];
		}else {
			System.out.println("The stack is empty");
			return 'O';
		}
	}
	
	public char peak() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top+1 == max_size);
	}
}
