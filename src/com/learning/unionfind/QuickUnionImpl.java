package com.learning.unionfind;

public class QuickUnionImpl implements IUnionFind 
{	
	int n = 0;
	int objects[] = null;

	/**
	 * 
	 * @param n number of objects in this union Find
	 */
	public QuickUnionImpl(int n) 
	{
		this.n = n;
		objects = new int[n];
		for(int i=0; i<n; i++)
			objects[i]=i;
	}

	private int root(int p)
	{
		while(p != objects[p])
			p = objects[p];
		
		return p;
	}

	@Override
	public void union(int p, int q) 
	{
		int pRoot = root(p);
		int qRoot = root(q);
		objects[pRoot] = qRoot;
		return;
		
	}

	@Override
	public boolean isConnected(int p, int q) 
	{	
		return root(p) == root(q);
	}

	@Override
	public int find(int p) 
	{
		return root(p);
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
			strBuffer.append(i + " ==> " + root(i));
			if(i+1 < n)
				strBuffer.append('\n');
		}
		return strBuffer.toString();
	}

}
