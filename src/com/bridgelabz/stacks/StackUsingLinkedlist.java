package com.bridgelabz.stacks;
import static java.lang.System.exit;


public class StackUsingLinkedlist {

	private class Node {
		 
        int data; 
        Node link; 
    }
    
    Node top;
    
    StackUsingLinkedlist()
    {
        this.top = null;
    }
 
    // to add values into the stack
    public void add(int x) 
    {
        // create new node temp and allocate memory
        Node temp = new Node();
 
        if (temp == null) {
            System.out.print("\nDSata Overflow");
            return;
        }
 
        temp.data = x;
 
        temp.link = top;
 
        top = temp;
    }
 
    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }
    //to display the data
    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                System.out.printf("%d->", temp.data);
 
                temp = temp.link;
            }
        }
    }

}
