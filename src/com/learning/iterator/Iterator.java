package com.learning.iterator;

public interface Iterator<item> 
{
	public boolean hasNext(); // returns true if there is a next item
	
	public item next(); // returns the next element in the iterator
}
