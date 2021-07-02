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

	public void deQueue() 
	{
		mylinkedList.pop();
	}
	
	public static void main(String[] args) {
		
		MyQueue myQueue = new MyQueue();
		myQueue.enQueue(56);
		myQueue.enQueue(30);
		myQueue.enQueue(70);
		myQueue.print();
		System.out.println();
		
		myQueue.deQueue();
		System.out.println("After dequeuing the queue :");
		myQueue.print();	
	}

}
