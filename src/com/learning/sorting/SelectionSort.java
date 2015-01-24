package com.learning.sorting;

import com.learning.util.SortingUtil;

public class SelectionSort 
{
	
	/**
	 * @param objects Objects to be sorted using the Selection sort.
	 * 
	 * LOOP INVARIANT always in the iteration 'i' all the objects to the left of i are sorted.
	 * 
	 * Find the Lowest element in the right of the i-th iteration and place it in that i-th iteration element
	 * 
	 * Selection sort is the selection of the minimum element from the rest of the elements from the i-th element
	 * from the rest of the length - i elements.
	 * 
	 */
	public static void sort(Comparable objects[])
	{
		for(int i = 0; i < objects.length; i++)
		{
			int min = i; // Presently element i is the minimum element.
			for(int j = i+1; j < objects.length; j++)
			{
				if(SortingUtil.isLessThan(objects[j], objects[min]))
					min = j;
			}
			SortingUtil.exchange(objects, i, min);
		}
	}
}
