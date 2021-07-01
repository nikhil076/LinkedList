package com.bridgelabz.linkedList;

public class MyNode 
{
	
	int data =0;
	MyNode next;
	
	public MyNode(int data, MyNode next) 
	{
		super();
		this.data = data;
		this.next = null;
	}
	public MyNode()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public int getData()
	{
		return data;
	}
	public void setData(int data) 
	{
		this.data = data;
	}
	public MyNode getNext()
	{
		return next;
	}
	public void setNext(MyNode next)
	{
		this.next = next;
	}

}
