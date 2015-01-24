package com.learning.priorityqueue;

public interface IMaximumPriorityQueue<Key extends Comparable<Key>> 
{
	/**
	 * Inserts an element with Key v into the priority Queue.
	 * @param v
	 */
	public void insert(Key v);
	
	/**
	 * return and delete the maximum Key in the Priority Queue.
	 * @return
	 */
	public Key delMax(); 
	
	/**
	 * Checks whether the list is empty or not.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * return the maximum element
	 * @return
	 */
	public Key getMax();
	
	/**
	 * returns the size of the Priority Queue.
	 * @return
	 */
	public int size();
	
	
}
