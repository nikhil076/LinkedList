package com.bridgelabz.linkedList;

import java.util.Scanner;

public class LinkedListExample 
{
	Scanner scanner = new Scanner(System.in);
	public static MyNode head;
	
	public void append(int data ) 
	{
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
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
	public int userValueToInsert() 
	{
		System.out.println("Enter a value you want to insert :");
		return scanner.nextInt();
	}
	public int beforeValue()
	{
		System.out.println("Enter a value to check the before value :");
		return scanner.nextInt();
	}
	public int afterValue()
	{
		System.out.println("Enter a value to check the after value");
		return scanner.nextInt();
	}
	public MyNode addBetweenValues(int value,int after,int before)
	{
		MyNode a = new MyNode(value);
		int len =0;
		MyNode newNode = head;
		while(newNode !=null)
		{
			len++;
			newNode = newNode.next;
		}
		newNode = head;
		if(newNode.data==before && newNode.next.data==after)
		{
			a.next = newNode.next;
			head.next = a;
			
		}
		return head;
	}
	//to add elements in the linked list
	public void add(int data)
	{
		MyNode newData = new MyNode(data);
		
		if(head == null)
		{
			
			head = newData;
		}
		else
		{
			newData.next = head;
			head = newData;
		}		
	}
	//print all elements in the list
	public void print()
	{
		MyNode tempNode = head;
		if(head !=null) {
			while(tempNode != null)
			{
				System.out.print(tempNode.data+"->");
				tempNode=tempNode.next;
			}
		}
		else {
		System.out.println("data = "+tempNode);}
	}
	public static void main(String[] args) 
	{
		LinkedListExample linkedListAdd = new LinkedListExample();
		System.out.println("By adding the values in the list ");
		linkedListAdd.add(70);
		linkedListAdd.add(30);
		linkedListAdd.add(56);
		linkedListAdd.print();
		System.out.println();
		int value = linkedListAdd.userValueToInsert();
		int afterValue = linkedListAdd.afterValue();
		int beforeValue = linkedListAdd.beforeValue();
		MyNode newData = linkedListAdd.addBetweenValues(value,afterValue,beforeValue);
		linkedListAdd.print();
	}

}
