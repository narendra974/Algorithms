package com.learning.priorityqueue;

import com.learning.util.SortingUtil;

public class MinimumPriporityQueue<Item extends Comparable<Item>> 
{
	private int capacity = 0;
	private Item[] items = null;
	private int N = 0; // number of elements inserted so far;
	
	@SuppressWarnings("unchecked")
	public MinimumPriporityQueue(int capacity) 
	{
		this.capacity = capacity;
		items = (Item[])new Comparable[this.capacity];
	}
	
	public void insert(Item item)
	{
		items[this.N] = item;
		this.N = this.N + 1;
		swim(N-1);
	}
	
	public Item getMinimum()
	{
		if(N == 0)
			return null;
		
		 return items[0];
	}
	
	public Item deleteMinimum()
	{
		if(N == 0)
			return null;
		
		Item minItem = items[0];
		items[0] = items[this.N - 1];
		this.N = this.N - 1;
		sink(0);
		return minItem;
	}
	
	private void sink(int i)
	{
		int minIndex = i;
		
		if(2*i + 1 < N && items[minIndex].compareTo(items[2*i + 1]) >  0)
		{
			minIndex = 2*i + 1;
		}
		
		if((2*i + 2 < N) && (items[minIndex].compareTo(items[2*i + 2]) > 0))
		{
			minIndex = 2*i + 2;
		}
		
		if(minIndex != i)
		{
			SortingUtil.exchange(items, i, minIndex);
			sink(minIndex);
		}
		
	}
	
	private void swim(int i)
	{
		int parent = (i-1)/2;
		
		if(parent >= 0)
		{
			if(items[i].compareTo(items[parent]) < 0)
			{
				SortingUtil.exchange(items, i, parent);
				swim(parent);
			}
		}
	}
	
	public boolean isEmpty()
	{
		return N == 0;
	}
}
