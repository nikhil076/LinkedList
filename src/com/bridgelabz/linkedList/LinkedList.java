package com.bridgelabz.linkedList;

public class LinkedList 
{
	MyNode head;
	

	public void add(int data)
	{
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	public void print()
	{
		MyNode tempNode = head;
		while(tempNode.next != null)
		{
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
		}
		System.out.println(tempNode.data);
	}

	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		System.out.println("By adding the values in the list ");
		linkedList.add(70);
		linkedList.add(30);
		linkedList.add(56);
		linkedList.print();
	}

}
