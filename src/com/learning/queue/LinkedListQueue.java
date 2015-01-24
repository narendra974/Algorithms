package com.learning.queue;

import com.learning.iterator.Iterable;
import com.learning.iterator.Iterator;

public class LinkedListQueue<Item> implements IQueue<Item>, Iterable<Item>
{
	Node head = null; // pop from the head... // Works like a ticket counter
	Node tail = null; // push to the tail..
	int size = 0;
	
	private class Node
	{
		Node(Item item, Node next)
		{
			this.item = item;
			this.next = next;
		}
		Item item = null;
		Node next = null;
	}

	@Override
	public void enque(Item item) 
	{
		Node node = new Node(item, null);
		if(isEmpty())
		{
			head = node;  // Since Empty both points to the same node
			tail = node;
		}
		else
		{
			tail.next = node;  // Not empty so change the tail do not worry about the Head.
			tail = node;
		}
		size++;
	}

	@Override
	public Item deque() 
	{
		Item item = null;
		if(isEmpty())
		{
			return null;
		}
		else
		{
			item = head.item;
			head = head.next;
		}
		size--;
		if(isEmpty()) // If Empty Change the TAIL TO Point NULL
		{
			tail = null;
			head = null;
		}
		return item;
	}

	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public boolean isEmpty() 
	{
		return size == 0;
	}

	@Override
	public Iterator<Item> getIterator() {
		return new IteratorImpl();
	}
	
	class IteratorImpl implements Iterator<Item>
	{
		Node current = head;
		
		@Override
		public boolean hasNext() 
		{
			return current != null;
		}

		@Override
		public Item next() 
		{
			Item item = current.item;
			current = current.next;
			return item;
			
		}
		
	}

}
