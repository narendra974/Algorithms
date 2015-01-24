package com.learning.queue;

public interface IQueue<Item> 
{
	public void enque(Item item);
	
	public Item deque();
	
	public int size();
	
	public boolean isEmpty();
}
