package com.bridgelab.Datastructure;

class MyNode<T>{

	T data;
	MyNode<T> next;

	MyNode(T data){
		this.data=data;
		this.next=null;
	}
}

public class LinkedList <T> {
	MyNode <T> first=null;
	MyNode <T> end;
	int count;
	public void iterate()
	{
		MyNode<T> temp = first;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}




	public void add(T value)
	{  

		MyNode<T>  n= new MyNode<T>(value);
		n.data=value;
		n.next=null;
		n.next=first;
		first=n;
	}


	public void remove( T item) {
		MyNode<T> temp = first;
		MyNode<T> prev = first;

		if(first.data==item){
			first =first.next;

		}else {

			while(temp.data!=item) {
				prev=temp;
				temp =temp.next;
			}
			prev.next=temp.next;
		}


	}




	public boolean search(T item)
	{
		MyNode <T> temp = first;
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
		MyNode<T> temp=first;
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
			MyNode <T>temp = first;
			first=first.next;
			return  temp.data;
		}
		return null;
	}

	public void display()
	{
		int size=size();
		MyNode<T> temp=first;
		for(int i=0;i<size;i++)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public void append(T value)
	{

		MyNode<T> node=new MyNode<T>(value);

		if(first==null)
			first=node;
		else
			end.next=node;

		end=node;
		count++;
	}

	public String toString()
	{
		String string ="";
		MyNode<T> temp=first;
		while(temp!=null)
		{
			string=string+temp.data+" ";
			temp=temp.next;
		}
		return string;
	}

}
