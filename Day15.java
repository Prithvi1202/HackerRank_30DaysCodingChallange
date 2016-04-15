package com.prithvi.hackkerrank;

import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Day15
{
	public static  Node insert(Node head,int data)
	{
		
		Node node = new Node(data);
		 if (head == null) {
	            head = node;
	            return head;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }

	        temp.next = node;

	        //System.out.println("Head data: " + head.data + "Head next: " + head.next);
	        return head;        
	}
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }

}