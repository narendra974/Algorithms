package com.learning.stack;

public class ArrayStack<Item> implements IStack<Item> 
{
	@SuppressWarnings("unchecked")
	private Item node[] = (Item[])new Object[1]; // Introduces Lint Errors we have to uncheck Lint errros
	private int size = 0;

	@Override
	public void push(Item item) 
	{
		if(size == node.length)
		{
			reSize(2*size());
		}
		node[size++] = item;
	}

	@Override
	public Item pop() 
	{
		if(size <= 0)
			return null;
		
		Item item = node[--size];
		// Now Consider resizing the array if the array is only 25% FULL
		if(size > 0 && size == node.length/4)
		{
			reSize(node.length/2);
		}
		return item;
	}

	@Override
	public boolean isEmpty() 
	{
		return size == 0;
	}

	@Override
	public int size() 
	{
		return size;
	}
	
	private void reSize(int capacity)
	{
		@SuppressWarnings("unchecked")
		Item tempnode[] = (Item[])new Object[capacity];
		for(int i=0; i < size; i++)
		{
			tempnode[i] = node[i];
		}
		node = tempnode;
	}

}
