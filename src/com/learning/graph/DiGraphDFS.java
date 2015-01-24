package com.learning.graph;

import com.learning.collection.Bag;
import com.learning.iterator.Iterator;

public class DiGraphDFS 
{
	private boolean[] marked = null;
	private DiGraph graph = null;
	private int[] edgeTo =  null;
	
	
	public DiGraphDFS(DiGraph graph, int s)
	{
		this.graph = graph;
		marked = new boolean[graph.NumberOfVertices()];
		edgeTo = new int[graph.NumberOfVertices()];
		for(int i = 0; i<graph.NumberOfVertices(); i++)
			edgeTo[i] = -1;
		dfsGraph(s);		
	}
	
	public DiGraphDFS(DiGraph graph, Bag<Integer> sources)
	{
		Iterator<Integer> list = sources.getIterator();
		while(list.hasNext())
		{
			int temp = list.next();
			if(! marked[temp])
			{
				dfsGraph(temp);
			}
		}
	}
	
	public void dfsGraph(int source)
	{
		marked[source] = true;
		Iterator<Integer> list = graph.adjacentTo(source);
		while(list.hasNext())
		{
			int temp = list.next();
			if(! marked[temp])
			{
				edgeTo[temp] = source;
				dfsGraph(temp);
			}
		}
	}
	
	public boolean isMarked(int v)
	{
		return marked[v];
	}
	
	public int edgeTo(int V)
	{
		return edgeTo[V];
	}
}
