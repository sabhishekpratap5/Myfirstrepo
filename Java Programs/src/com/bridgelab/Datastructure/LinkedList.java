package com.bridgelab.Datastructure;

public class LinkedList <T> {
	Node first=null;
	public class Node{
		T data;
		Node next;
	}
	public Node list()
	{
		Node node = new Node();
		return node;
	}
	public void add(T value)
	{  
		Node  n=list();
		n.data=value;
		n.next=null;
		n.next=first;
		first=n;
	}

	public void remove(T item)
	{
		Node temp = first;
		while(true)
		{
			if(temp.next.data.equals(item))
			{
				temp.next = temp.next.next;
				break;
			}
			temp=temp.next;
		}

	}

	public boolean search(T item)
	{
		Node temp = first;
		while(temp!=null)
		{
			if((temp.data).equals(item))
			{
				return true;

			}
			temp=temp.next;
		}
		return false;
	}
	
	public boolean isEmpty()
	{
		if(first==null)
			
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public int size()
	{
		Node temp=first;
		int count =0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	public T pop()
	{
		if (first!=null)
		{
			Node temp = first;
			first=first.next;
			return temp.data;
		}
		return null;
	}
	
	public void display()
	{
	   int size=size();
		Node temp=first;
		for(int i=0;i<size;i++)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	

}
