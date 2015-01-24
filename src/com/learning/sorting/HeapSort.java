package com.learning.sorting;

import com.learning.util.SortingUtil;

public class HeapSort 
{
	
	public static void sort(Comparable objects[])
	{
		for(int k = objects.length; k > 1; k--)
		{
			build_binary_heap_tree(objects, k);
			Comparable temp = objects[0];
			objects[0] = objects[k-1];
			objects[k-1] = temp;
		}
	}
	
	private static void build_binary_heap_tree(Comparable objects[], int length)
	{
		for(int i = length/2; i >= 0; i--)
			sink(objects, i, length);
	}
	
	private static void sink(Comparable objects[], int i, int length)
	{
		int maxIndex = i;
		
		if(2*i + 1 < length && objects[maxIndex].compareTo(objects[2*i + 1]) < 0)
		{
			maxIndex = 2*i + 1;
		}
		
		if((2*i + 2 < length) && (objects[maxIndex].compareTo(objects[2*i + 2]) < 0))
		{
			maxIndex = 2*i + 2;
		}
		
		if(maxIndex != i)
		{
			SortingUtil.exchange(objects, i, maxIndex);
			sink(objects, maxIndex, length);
		}
	}
	
	private static void swim(Comparable objects[],int i)
	{
		int parent = (i-1)/2;
		
		if(parent >= 0)
		{
			if(objects[i].compareTo(objects[parent]) > 0)
			{
				SortingUtil.exchange(objects, i, parent);
				swim(objects, parent);
			}
		}
	}
}
