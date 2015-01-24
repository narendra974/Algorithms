package com.learning.sorting;

import com.learning.util.SortingUtil;

public class QuickSort 
{
	
	public static void sort(Comparable[] objects)
	{
		sort(objects, 0, objects.length-1);
	}
	
	public static void sort(Comparable[] objects, int low, int high)
	{
		if(high <= low) // Even For Two Elements Quick Sort partition works .. but does not work for the one element So have to take care of that.
			return;
		int k = partition(objects, low, high);
		if(k > 0)
			sort(objects, low, k-1);
		if(k<high)
			sort(objects, k+1, high);
	}
	
	private static int partition(Comparable[] objects, int low, int high)
	{		
		/** programming principle to be followed is such that i and j should be in that bounds should not cross the bonds
		 * at any stage of the Program so we need not check the boundary conditions in the program after the loop
		 */
		
		int i = low;
		int j = high+1;
		while(true)
		{
			while(true)
			{
				i = i +1; 
				if(SortingUtil.isgreaterThan(objects[i], objects[low]))
					break;
				if( i == high)
					break;
			}
		
			while(true)
			{
				j = j -1;		
				if(SortingUtil.isLessThan(objects[j], objects[low]))
					break;
				if(j == low)
					break;
			}
			
			if( i >= j)
				break;
			
			SortingUtil.exchange(objects, i, j);
		}
		
		SortingUtil.exchange(objects, low, j);
		return j;
	}

}
