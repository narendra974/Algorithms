package com.learning.priorityqueue;

public class UnorderedPQ<Key extends Comparable<Key>> implements IMaximumPriorityQueue<Key>
{
	private int N = 0; // number of elements in the priority Queue.
	
	private Key[] keys = null; // Store the capacity number of elements.
	
	@SuppressWarnings("unchecked")
	public UnorderedPQ(int capacity) 
	{
		// keys = new Key[capacity]; // Cannot create a generic array Creation
		keys = (Key [])new Comparable[capacity];
	}
	
	@Override
	public void insert(Key v) 
	{
		if(N < keys.length)
			keys[N++] = v;
	}

	@Override
	public Key delMax() 
	{
		Key maxElement = null;
		if(isEmpty())
		{
			return null;
		}
		else if(N == 1)
		{
			maxElement = keys[--N];
		}
		else // This is exchange 
		{
			int maxIndex = getMaxIndex();
			maxElement = keys[maxIndex];
			Key lastKey = keys[N-1];
			keys[maxIndex] = lastKey;
			keys[N-1] = null;
			N--;
		}
		return maxElement;
	}

	@Override
	public boolean isEmpty() 
	{
		return N == 0;
	}

	@Override
	public Key getMax() 
	{
		if(isEmpty())
			return null;
		
		return keys[getMaxIndex()];
	}
	
	private int getMaxIndex()
	{
		int maxIndex = 0;
		for(int i = 0; i < N; i++)
		{
			if(keys[i].compareTo(keys[maxIndex]) > 0)
			{
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	@Override
	public int size() 
	{
		return N;
	}
	
	public String toString()
	{
		return null;
	}

}
