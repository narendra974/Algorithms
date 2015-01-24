package com.learning.unionfind;

public class PathCompressionWeightedUnionFind extends WeightedUnionFind {

	public PathCompressionWeightedUnionFind(int n) 
	{
		super(n);
	}
	
	@Override
	protected int root(int p) 
	{
		if(p >= count())
			return -1;
		
		while(p != objects[p])
		{
			objects[p] = objects[objects[p]]; // Pointing to the Grand Parent
			p =objects[p];
		}
		
		return p;

	}

}
