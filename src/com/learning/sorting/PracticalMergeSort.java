package com.learning.sorting;

import com.learning.util.SortingUtil;

/**
 * 
 * Two Changes have been done from the regular merge sort
 * 
 * 1. Check if the merge is really necessary.
 * 2. Insertion sort for the elements less than 7
 * 
 * @author narendra
 *
 */

public class PracticalMergeSort 
{
	private static final int COUNT = 8;
	
	public static void sort(Comparable[] objects)
	{
		Comparable[] auxObjects = new Comparable[objects.length];
		sort(objects, auxObjects, 0, objects.length-1);
	}
	
	private static void sort(Comparable[] objects, Comparable[] auxObjects,int low, int high)
	{
		/**
		 * IF LESS THAN 8 DO THE INSERTION SORT
		 */
		int mid = 0;
		if(high-low < COUNT)
		{
			InsertionSort.sort(objects, low, high);
			return;
		}
		mid = (high + low)/2;
		sort(objects, auxObjects, low, mid);
		sort(objects, auxObjects, mid+1, high);
		// Check if Merge is necessary, lastItem in the first row is smaller than the first element in the second row so return immediately.
		if(SortingUtil.isLessThan(objects[mid], objects[mid+1]))
			return;
		merge(objects, auxObjects, low, mid, high);
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
			else if( j > high) // Second Sub Array was done so take from the first array
				objects[k] = auxObjects[i++];
			else if(SortingUtil.isLessThan(auxObjects[i], auxObjects[j]))
				objects[k] = auxObjects[i++];
			else
				objects[k] = auxObjects[j++];
			
		}
	}
}
