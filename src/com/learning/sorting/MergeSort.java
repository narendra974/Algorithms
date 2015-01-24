package com.learning.sorting;

import com.learning.util.SortingUtil;

public class MergeSort 
{
	
	public static void sort(Comparable[] objects)
	{
		Comparable[] auxObjects = new Comparable[objects.length];
		sort(objects, auxObjects, 0, objects.length-1);
	}
	
	private static void sort(Comparable[] objects, Comparable[] auxObjects,int low, int high)
	{
		int mid = 0;
		if(high - low == 0) // Only One element requested so returning.
			return;
		
		if(high - low == 1) // Two elements so do the 
		{
			if(SortingUtil.isLessThan(objects[high], objects[low]))
			{
				Comparable temp = objects[high];
				objects[high] = objects[low];
				objects[low] = temp;
			}
			return;
		}
		mid = (high + low)/2;
		sort(objects, auxObjects, low, mid);
		sort(objects, auxObjects, mid+1, high);
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
			else if( j > high)
				objects[k] = auxObjects[i++];
			else if(SortingUtil.isLessThan(auxObjects[i], auxObjects[j]))
				objects[k] = auxObjects[i++];
			else
				objects[k] = auxObjects[j++];
			
		}
	}
}
