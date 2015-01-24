package com.learning.unionfind;

public class WeightedUnionFind implements IUnionFind 
{
	int n = 0; 
	int objects[] = null;
	int sizeOfTree[] = null;
	
	public WeightedUnionFind(int n) 
	{
		this.n = n;
		this.objects = new int[n];
		this.sizeOfTree = new int[n];
		
		for(int i = 0; i < n ; i++)
		{
			objects[i]=i;  // Each Object has a root of its own
			sizeOfTree[i]=1; // Each Object is size of the root
		}
	}
	
	protected int root(int p)
	{
		if(p >= this.n)
			return -1;
		
		while(p != objects[p])
			p = objects[p];
		
		return p;
		
	}
	
	@Override
	public void union(int p, int q) 
	{
 		int rootP = root(p);
 		int rootQ = root(q);
 		
 		if(rootP == rootQ)
 		{
 			return; // Already both are connected.
 		}
 		
 		int sizeP = sizeOfTree[rootP];
 		int sizeQ = sizeOfTree[rootQ];
 		if(sizeP > sizeQ)
 		{
 			objects[rootQ] = rootP;
 			sizeOfTree[rootP] = sizeP+sizeQ;
 			sizeOfTree[rootQ] = 0;
 		}
 		else
 		{
 			objects[rootP] = rootQ;
 			sizeOfTree[rootQ] = sizeP + sizeQ;
 			sizeOfTree[rootP] = 0;
 		}	
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
			strBuffer.append(i + " ==> " + objects[i] + "/" + sizeOfTree[i]);
			if(i+1 < n)
				strBuffer.append('\n');
		}
		return strBuffer.toString();
	}
	
}
