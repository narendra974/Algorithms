package com.learning.minimumspanningtree;

public class Edge implements Comparable<Edge>
{
	private int v;
	private int w;
	private double weight;
	
	Edge(int v, int w, double weight)
	{
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public int either()
	{
		return v;
	}
	
	public int other(int v)
	{
		if(this.v == v)
			return this.w;
		else
			return this.v;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	@Override
	public int compareTo(Edge edge) 
	{
		if(this.weight < edge.getWeight()) return -1;
		else if(this.weight > edge.getWeight()) return 1;
		else return 0;
	}
	
	@Override
	public String toString() 
	{
		return "v = " + v + " w = " + w + " weight = " + weight;
	}

}
