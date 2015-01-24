package com.learning.stack;

public interface IStack<Item> 
{
	public void push(Item item);
	
	public Item pop();
	
	public boolean isEmpty();
	
	public int size();
}
