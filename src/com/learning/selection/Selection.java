package com.learning.selection;

import com.learning.util.SortingUtil;

public class Selection 
{
	
	public static Comparable select(Comparable[] objects, int k)
	{
		
		if( k >= objects.length && k < 0)
			return null;

		int high = objects.length-1;
		int low = 0;
		
		while(high >= low)
		{
			int j = partition(objects, low, high);
			if(j < k)
			{
				low = j + 1;
			}
			else if (j > k)
			{
				high = j - 1;
			}
			else 
				return objects[k];
		}
		return null;
	}
	
	private static int partition(Comparable[] objects, int low, int high)
	{		
		/** programming principle to be followed is such that i and j should be in that bounds should not cross the bonds
		 * at any stage of the Program so we need not check the boundary conditions in the program after the loop
		 */
		if(high == low)
			return high;
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
