package com.learning.graph;

import java.lang.reflect.Array;

import com.learning.iterator.Iterator;
import com.learning.queue.LinkedListQueue;

public class DiGraphBFS 
{
	private boolean[] marked = null;
	private DiGraph graph = null;
	private int[] edgeTo =  null;
	private int source;
	private LinkedListQueue<Integer> queue = new LinkedListQueue<>();
	
	public DiGraphBFS(DiGraph diGraph, int source)
	{
		this.graph = diGraph;
		this.source = source;
		marked = new boolean[graph.NumberOfVertices()];
		edgeTo = new int[graph.NumberOfVertices()];
		for(int i = 0; i<graph.NumberOfVertices(); i++)
			edgeTo[i] = -1;
		marked[source] = true;
		queue.enque(source);
		diGraph();
	}
	
	public void diGraph()
	{
		while(! queue.isEmpty())
		{
			Integer v = queue.deque();
			Iterator<Integer> tempIterator = graph.adjacentTo(v);
			while(tempIterator.hasNext())
			{
				Integer w = tempIterator.next();
				if(! marked[w])
				{
					edgeTo[w] = v;
					marked[w] = true;
					queue.enque(w);
				}
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
