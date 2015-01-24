package com.learning.symboltables;

public class LinkedListSymbolTable<Key, Value> implements ISymbolTable<Key, Value>
{
	class Node
	{
		Key key;
		Value value;
		Node next;
		
		Node(Key key, Value value)
		{
			this.key = key;
			this.value = value;
		}
	}
	
	Node root;
	
	@Override
	public void put(Key key, Value value) 
	{
		if(root == null)
		{
			Node temp = new Node(key, value);
			root = temp;
			return;
		}
		Node temp = root;
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		// Not able to find the match so create the node and make it first element 
		temp = new Node(key, value);
		temp.next = root;
		root = temp;
		
		
	}

	@Override
	public Value get(Key key) 
	{
		Node temp = root;
		while(temp != null)
		{
			if(temp.key.equals(key))
				return temp.value;
			
			temp = temp.next;
		}
		return null;
	}

	@Override
	public boolean contains(Key key) 
	{	
		return get(key) != null;
	}

	@Override
	public void delete(Key key) 
	{
		Node prevNode = null;
		Node presentnode = root;
		while(presentnode != null)
		{
			if(presentnode.key.equals(key))
			{
				if(prevNode != null)
					prevNode.next = presentnode.next;
				else // Then it is root.
					root = presentnode.next;
			}
			prevNode = presentnode;
			presentnode = presentnode.next;
		}
		
	}

	@Override
	public boolean isEmpty() 
	{
		return root != null;
	}

	@Override
	public int size() 
	{
		int size = 0;
		Node temp =  root;
		while(temp != null)
		{
			size++;
			temp = temp.next;
		}
		return size;
	}

	@Override
	public Iterable<Key> keys() 
	{
		return null;
	}

}
