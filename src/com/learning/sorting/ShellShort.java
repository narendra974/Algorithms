package com.learning.sorting;

import com.learning.util.SortingUtil;

/**
 * based on the insertion sort .. 
 * 
 * First Sort the sequencce 1, 4, 13..
 * all 13, 26, 39, ... elements are sorted
 * all 4, 8 , 12 elements are sorted.
 * all 1, 2, 3, 4 .. elements are sorted. 
 *
 * As mentioned in the insertion sort partially sorted elements will increase the performance.
 * 
 * Another lemma is that if an array is h sorted .. it g-sorted on that .. it will remain h - sorted also.
 *
 * @author narendra
 *
 */
public class ShellShort 
{
	public static void sort(Comparable objects[])
	{
		int length = objects.length;
		int h = 1; // h is the sequence interval.
		while(h < length/3)
			h = 3*h+1; // Finding the better sequence
		
		while(h > 0)
		{
			for(int i = 0; i < length ; i++)
			{
				for(int j = i; j >= h ; j = j-h)
				{
					if(SortingUtil.isLessThan(objects[j], objects[j-h]))
						SortingUtil.exchange(objects, j, j-h);
					else
						break;
				}
			}
			h=h/3;
		}
	}
}
