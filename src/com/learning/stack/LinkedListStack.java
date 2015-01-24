package com.learning.stack;

public class LinkedListStack<Item> implements IStack<Item> 
{
	private class Node  // LINKED LIST NODE
	{
		Item item = null;
		Node next = null;
		
		public Node(Item item, Node node) 
		{
			this.item = item;
			this.next = node;
		}
	}
	
	Node topMostNode = null; // Maintain the Top Node
	int N = 0; // Number of Items in the Stack so far;
	
	@Override
	public void push(Item item) 
	{
		topMostNode = new Node(item, topMostNode); // Creates the top MostNode
		N++;
	}

	@Override
	public Item pop() 
	{
		Item temp = null;
		if(topMostNode != null)
		{
			temp = topMostNode.item;
			topMostNode = topMostNode.next;
			N--;
		}
		return temp;
	}

	@Override
	public boolean isEmpty() 
	{
		return topMostNode == null;
	}

	@Override
	public int size() 
	{
		return N;
	}
	
}
