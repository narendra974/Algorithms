package com.learning.sorting;

import com.learning.util.SortingUtil;

public class ThreeWayQuickSort 
{

	public static void sort(Comparable[] objects)
	{
	
		sort(objects, 0, objects.length-1);
	}
	
	public static void sort(Comparable[] objects, int low, int high)
	{		if(high <= low) // minimum two elements are need for the partitioning.
			return;
	
		int left = low;  // Always point to the first Equal Element in the row
		int right = high;  // Points to the right element where the element is greater than the partitioning element.
		Comparable partionElement = objects[low]; // Partition Element to be stored
		int i = left;
		while(i<=right)
		{
			if(SortingUtil.isLessThan(objects[i] ,partionElement)) // If the present ith element is less than partitioning Element
			{
				SortingUtil.exchange(objects, i, left);
				i++;
				left++;
			}
			else if(SortingUtil.isgreaterThan(objects[i], partionElement)) // if the present i-th element is greater than the partition element.
			{
				// Exchange the elements   // In this case we should not increase the it should be exchanged later 
				SortingUtil.exchange(objects, i, right);
				right--;  
			}
			else
			{
				i++;
			}
		}
		sort(objects, low, left-1); // As Left points to the first p element, so sorting from low to the left-1 element
		sort(objects, right+1, high); // As the right points to the 
	}
	
}
