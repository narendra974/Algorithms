package com.learning.sorting;

import com.learning.util.SortingUtil;

/**
 * Concise industrial Strength Code if you have space
 * 
 * @author narendra
 *
 */

public class BottomUpMergeSort 
{
	
	public static void sort(Comparable[] objects)
	{
		Comparable[] auxObjects = new Comparable[objects.length];
		
		for(int SZ = 2; SZ/2 < objects.length; SZ = SZ + SZ)
		{
			for(int low = 0; low + (SZ/2) < objects.length; low = low + SZ)
			{
				int temp = low+SZ-1;
				if(temp > objects.length-1)
					temp = objects.length-1; // Second Half might be there or not sure .. so have always to check the 
				merge(objects, auxObjects, low, low+ (SZ/2) - 1, temp);
			}
		}
	}
	
	/**
	 * Merge two sorted arrays from low to Mid and Mid to High Both are included.
	 * 
	 * sorted arrays low to mid and mid+1 to high
	 * 
	 * @param objects
	 * @param auxObjects
	 * @param low 
	 * @param mid
	 * @param high
	 */
	private static void merge(Comparable[] objects, Comparable[] auxObjects, int low, int mid, int high)
	{
		
		/** 
		 * First Copy the objects to the auxilary objects
		 */
		for(int k = low; k <= high; k++)
			auxObjects[k] = objects[k];
					
		int i = low; 
		int j = mid + 1;
		for(int k = low; k <= high; k++)
		{
			if( i > mid) // First sub array was done so take from second sorted array
				objects[k] =  auxObjects[j++];
			else if( j > high)
				objects[k] = auxObjects[i++];
			else if(SortingUtil.isLessThan(auxObjects[i], auxObjects[j]))
				objects[k] = auxObjects[i++];
			else
				objects[k] = auxObjects[j++];
			
		}
	}

}
