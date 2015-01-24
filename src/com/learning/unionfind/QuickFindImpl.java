package com.learning.unionfind;

/**
 * 
 * @author Narendra Mutyala
 * 
 * Have to Check if for checking p and q values less than n can we 
 * use the aspect oriented programming so that we can avoid checking
 * the p and q every time. Check it later.
 *
 */

public class QuickFindImpl implements IUnionFind
{
	int n = 0;
	int objects[] = null;
	/**
	 * 
	 * @param n number of objects in this union Find
	 */
	public QuickFindImpl(int n) 
	{
		this.n = n;
		objects = new int[n];
		for(int i=0; i<n; i++)
			objects[i]=i;
	}

	@Override
	public void union(int p, int q) 
	{
		if(p >= n)
			return;
		
		if(q >= n)
			return;
		int temp = objects[q];
		
		// Go through each and every object
		for(int i=0; i<n; i++)
		{
			if(temp == objects[i]) // where ever q value is find change it to the p's value
			{
				objects[i]=objects[p];
			}
		}
		
	}

	@Override
	public boolean isConnected(int p, int q) 
	{	
		/**
		 * if both p and q belongs to the same connected component 
		 * both the objects are connected.
		 */
		if(find(p) == find(q))
			return true;
		return false;
	}

	@Override
	public int find(int p) 
	{
		/** 
		 * p cannot be greater than number of objects
		 * **/
		if(p>=n)
			return -1;
		
		return  objects[p];
	}

	@Override
	public int count() 
	{
		return n;
	}
	
	@Override
	public String toString() 
	{
		StringBuffer strBuffer = new StringBuffer();
		for(int i=0; i<n; i++)
		{
			strBuffer.append(i + " ==> " + objects[i]);
			if(i+1 < n)
				strBuffer.append('\n');
		}
		return strBuffer.toString();
	}

}
