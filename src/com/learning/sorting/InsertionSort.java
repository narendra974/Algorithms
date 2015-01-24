package com.learning.sorting;

import com.learning.util.SortingUtil;

/**
 * Partially Sorted Objects runs in linear time with the Insertion Sort.
 * 
 * For Every i th Iteration move the element corresponding to its element in the left of the List
 * 
 * @author narendra
 * 
 * Inserting the elements takes more frequently here ..
 *
 */
public class InsertionSort 
{

	public static void sort(Comparable objects[])
	{
		sort(objects, 0, objects.length-1);
	}
	
	public static void sort(Comparable objects[], int low, int high)
	{
		for(int i = low+1; i <= high ; i++)
		{
			for(int j = i; j > 0; j--)
			{
				if(SortingUtil.isLessThan(objects[j], objects[j-1]))
					SortingUtil.exchange(objects, j , j-1);
				else
					break;
			}
		}
	}

}
