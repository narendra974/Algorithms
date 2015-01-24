package com.learning.graph;

import com.learning.collection.Bag;
import com.learning.iterator.Iterator;
import com.learning.stack.LinkedListStack;

public class TopologicalSortOrderDiagraph 
{
	private DiGraph diGraph = null;
	private LinkedListStack<Integer> verticesOrder = null;
	private boolean[] visited = null;
	
	public TopologicalSortOrderDiagraph(DiGraph diGraph) 
	{
		this.diGraph = diGraph;
		visited = new boolean[diGraph.NumberOfVertices()];
		verticesOrder = new LinkedListStack<Integer>();
		Bag<Integer> vertices = diGraph.vertices();
		Iterator<Integer> verticesIterator = vertices.getIterator();
		while(verticesIterator.hasNext())
		{
			Integer temp = verticesIterator.next();
			if(! visited[temp])
			{
				visited[temp] = true;
				depthFirstSearch(temp);
			}
		}
	}
	
	private void depthFirstSearch(int s)
	{
		Iterator<Integer> adjacentList = this.diGraph.adjacentTo(s);
		while(adjacentList.hasNext())
		{
			Integer temp = adjacentList.next();
			if(! visited[temp])
			{
				visited[temp] = true;
				depthFirstSearch(temp);
			}
		}
		verticesOrder.push(s);
	}
	
	public LinkedListStack<Integer> TSortOrder()
	{
		return verticesOrder;
	}
 }
