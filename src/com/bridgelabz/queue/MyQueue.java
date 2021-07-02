package com.bridgelabz.queue;

import com.bridgelabz.linkedList.LinkedListExample;

public class MyQueue {

	public final LinkedListExample mylinkedList;

	public MyQueue() {
		super();
		this.mylinkedList = new LinkedListExample();
	}
	
	public void enQueue(int myNode)
	{
		mylinkedList.append(myNode);
	}
	
	public void print()
	{
		mylinkedList.print();
	}
	
	public static void main(String[] args) {
		
		MyQueue myQueue = new MyQueue();
		myQueue.enQueue(56);
		myQueue.enQueue(30);
		myQueue.enQueue(70);
		myQueue.print();
		System.out.println();	
	}

}
