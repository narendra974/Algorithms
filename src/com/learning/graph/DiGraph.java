package com.learning.graph;

import com.learning.collection.Bag;
import com.learning.iterator.Iterator;

public class DiGraph 
{
	private int V; // Number of Vertices
	private int E; // Number of Edges
	private Bag<Integer> adjacent[] = null;
	
	@SuppressWarnings("unchecked")
	public DiGraph(int V)
	{
		this.V = V;
		adjacent = (Bag<Integer>[]) new Bag[V];
		for(int i =0; i<V; i++)
			adjacent[i] = new Bag<Integer>();
	}

	public int NumberOfVertices()
	{
		return this.V;
	}
	
	public Bag<Integer> vertices()
	{
		Bag<Integer> vertices = new Bag<Integer>();
		for(int i = 0; i<V; i++)
			vertices.addItem(i);
		return vertices;
	}
	
	public int NumberOfEdges()
	{
		return this.E;
	}
	
	// Adding an directed Edge from v to w
	public void addEdge(int v, int w)
	{
		adjacent[v].addItem(w);
	}
	
	public Iterator<Integer> adjacentTo(int v)
	{
		return adjacent[v].getIterator();
	}
	
	public DiGraph reverseDiGraph()
	{
		DiGraph reverseGraph = new DiGraph(V);
		for(int i=0; i<V; i++)
		{
			Iterator<Integer> tempIterator = this.adjacentTo(i);
			while(tempIterator.hasNext())
			{
				reverseGraph.addEdge(tempIterator.next(), i);
			}
		}
		return reverseGraph;
	}
}
