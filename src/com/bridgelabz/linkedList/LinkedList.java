package com.bridgelabz.linkedList;

public class LinkedList 
{
	MyNode head;
	
	public void append(int data ) 
	{
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null)
		{
			this.head = newNode;
		}
		else
		{
			MyNode tempNode = head;
			while(tempNode.next!=null)
			{
				tempNode= tempNode.next;
			}
			tempNode.next= newNode;
		}
	}
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
		LinkedList linkedListAdd = new LinkedList();
		System.out.println("By Appending the values in list :");
		linkedListAdd.append(56);
		linkedListAdd.append(30);
		linkedListAdd.append(70);
		linkedListAdd.print();
		System.out.println();
		LinkedList linkedListAppend = new LinkedList();
		System.out.println("By adding the values in the list ");
		linkedListAppend.add(70);
		linkedListAppend.add(30);
		linkedListAppend.add(56);
		linkedListAppend.print();
	}

}
