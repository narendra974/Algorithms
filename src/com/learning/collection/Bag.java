package com.learning.collection;

import com.learning.iterator.Iterable;
import com.learning.iterator.Iterator;

public class Bag<Item> implements Iterable<Item> 
{
	class Node
	{
		Node(Item item, Node node)
		{
			this.item = item;
			this.next = node;
		}
		Item item;
		Node next;
	}
	
	Node first = null;
	
	@Override
	public Iterator<Item> getIterator() 
	{	
		return new ListIterator();
	}
	
	public void addItem(Item item)
	{
		Node temp = new Node(item, first);
		first = temp;
	}

	private class ListIterator implements Iterator<Item>
	{
		Node current = first;
		
		@Override
		public boolean hasNext() 
		{
			return current != null;
		}

		@Override
		public Item next() 
		{
			Item temp  = current.item;
			current = current.next;
			return temp;
		}
		
	}
}
