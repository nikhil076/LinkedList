package com.bridgelabz.stack;

import com.bridgelabz.linkedList.LinkedListExample;
import com.bridgelabz.linkedList.MyNode;

public class MyStack 
{
	public final LinkedListExample mylinkedList;
	
	public MyStack()
	{
		super();
		this.mylinkedList = new LinkedListExample();
	}

	public void push(int myNode)
	{
		mylinkedList.add(myNode);
	}
	public void print()
	{
		mylinkedList.print();
	}
	public void pop() 
	{
		mylinkedList.pop();
	}

	public static void main(String[] args) 
	{
		MyStack myStack = new MyStack();
		myStack.push(70);
		myStack.push(30);
		myStack.push(56);
		System.out.println("The Stack is:");
		myStack.print();
	}

}
