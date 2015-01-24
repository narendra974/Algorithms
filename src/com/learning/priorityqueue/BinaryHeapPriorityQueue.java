package com.learning.priorityqueue;

import com.learning.util.SortingUtil;

public class BinaryHeapPriorityQueue<Key extends Comparable<Key>> implements IMaximumPriorityQueue<Key> 
{
	private int N = 0; // number of elements in the priority Queue.	
	private Key[] keys = null; // Store the capacity number of elements.

	@SuppressWarnings("unchecked")
	public BinaryHeapPriorityQueue(int capacity)
	{
		// keys = new Key[capacity]; // Cannot create a generic array Creation
		keys = (Key [])new Comparable[capacity];
	}
	
	@Override
	public void insert(Key v) 
	{
		keys[N++] = v;
		swim(N-1); // Send to it place where it should be.
	}

	@Override
	public Key delMax() 
	{
		Key maxValue = keys[0];
		keys[0] = keys[N-1];
		keys[N-1] = null;
		N--;
		sink(0);
		return maxValue;
	}

	@Override
	public boolean isEmpty() 
	{
		return N == 0;
	}

	@Override
	public Key getMax() 
	{
		return keys[0];
	}

	@Override
	public int size() 
	{
		return N;
	}
	
	private void sink(int i)
	{
		int maxIndex = i;
		
		if(2*i + 1 < N && keys[maxIndex].compareTo(keys[2*i + 1]) < 0)
		{
			maxIndex = 2*i + 1;
		}
		
		if((2*i + 2 < N) && (keys[maxIndex].compareTo(keys[2*i + 2]) < 0))
		{
			maxIndex = 2*i + 2;
		}
		
		if(maxIndex != i)
		{
			SortingUtil.exchange(keys, i, maxIndex);
			sink(maxIndex);
		}
	}
	
	private void swim(int i)
	{
		int parent = (i-1)/2;
		
		if(parent >= 0)
		{
			if(keys[i].compareTo(keys[parent]) > 0)
			{
				SortingUtil.exchange(keys, i, parent);
				swim(parent);
			}
		}
	}
	
}
