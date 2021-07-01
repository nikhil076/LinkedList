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
	// to delete the first element
	public void pop()
	{
		if (head!=null)
		head = head.next;
	}
		
		//to delete the last element in the list
	public void popLast()
	{
		MyNode node = head;    //Initialize current 
	    while (node != null) 
	    { 
	    	if (node.next.next == null) 
	        {
	    		node.next = null;
	            break;
	         }
	         node = node.next; 
	     }
	}
	// to check for a element in the list
	public void findElement(int check)
	{
		MyNode current = head;    //Initialize current 
	    while (current != null) 
	    { 
	         if (current.data == check) 
	         {
	              System.out.println(check+" is present");
	         }
	         current = current.next; 
	    }  
	}
	public void addAfterElement(int check,int value)
	{
		MyNode current = head;    //Initialize current 
	    while (current != null) 
	    { 
	         if (current.data == check) 
	         {
	              current.next.data= value;
	              break;
	         }
	         current = current.next; 
	    }  
	}
	public void deleteElementAndPrintSize(int check)
	{
		int count=0;
		MyNode current = head;    //Initialize current 
	    while (current != null) 
	    { 
	         if (current.next.data == check) 
	         {
	              current.next=null;
	         }
	         count++;
	         current = current.next; 
	    }  
	    System.out.println("size of list is :"+count);
	}
	
	public MyNode sortedAdd(int value)
	{
		
		MyNode newValue = new MyNode(value);
		if(head == null)
		{
			head = newValue;
			
		}
		else
		{
			
			while(head != null)
			{
				if(head.data > newValue.data)
				{
					newValue.next = head;
					head = newValue;
					break;
				}
				else if(head.next == null)
				{
					head.next = newValue;
					break;
				}
				head = head.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) 
	{
		LinkedListExample linkedListAdd = new LinkedListExample();
		System.out.println("By adding the values in the list ");
		linkedListAdd.add(70);
		linkedListAdd.add(30);
		linkedListAdd.add(56);
		
		//deleted the first element and printed it
//		linkedListAdd.print();
		System.out.println();
		//to check a value is present in the list
		linkedListAdd.findElement(30);
		//adding element after 30 key
		linkedListAdd.addAfterElement(30, 40);
		//to delete 40 from the linked list
		linkedListAdd.deleteElementAndPrintSize(40);
		linkedListAdd.print();

		
		linkedListAdd.add(40);
		System.out.println();
		int value = linkedListAdd.userValueToInsert();
		int afterValue = linkedListAdd.afterValue();
		int beforeValue = linkedListAdd.beforeValue();
		MyNode newData = linkedListAdd.addBetweenValues(value,afterValue,beforeValue);
		//to pop the first value
		linkedListAdd.pop();
		System.out.println("Deleted first element");
		linkedListAdd.print();
		System.out.println();
		
		//deleting the last element in the list
		linkedListAdd.popLast();
		System.out.println("Deleted last element");
		linkedListAdd.print();
		
		
		//sort the value inside the add method call
		linkedListAdd.sortedAdd(56);
		linkedListAdd.sortedAdd(30);
		linkedListAdd.sortedAdd(40);
		linkedListAdd.sortedAdd(70);
		linkedListAdd.print();
	}

}
