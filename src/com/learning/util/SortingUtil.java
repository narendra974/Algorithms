package com.learning.util;

public class SortingUtil 
{
	/** 
	 * 
	 * @param v comparision object one
	 * @param u comparision object two
	 * @return true if v is less than u
	 */
	public static boolean isLessThan(Comparable v, Comparable u)
	{
		return v.compareTo(u) < 0;
	}
	
	public static boolean isgreaterThan(Comparable v, Comparable u)
	{
		return v.compareTo(u) > 0;
	}
	
	public static void exchange(Comparable[] objects, int i, int j)
	{
		Comparable temp = objects[i];
		objects[i] = objects[j];
		objects[j] = temp;
	}
	
	public static boolean isSorted(Comparable[] objects) 
	{
		for(int i = 0; i<objects.length-1 ; i++)
			if(isLessThan(objects[i+1], objects[i]))
				return false;
		
		return true;
	}

}
