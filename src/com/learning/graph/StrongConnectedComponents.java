package com.learning.graph;

import com.learning.iterator.Iterator;
import com.learning.stack.LinkedListStack;

public class StrongConnectedComponents 
{
	private boolean[] isVisited = null;
	private int[] strongComponent = null;
	private int count = 0;
	private DiGraph diGraph = null;
	
	public StrongConnectedComponents(DiGraph diGraph) 
	{
		isVisited = new boolean[diGraph.NumberOfVertices()];
		strongComponent = new int[diGraph.NumberOfVertices()];
		this.diGraph = diGraph;
		DiGraph reverseGraph = diGraph.reverseDiGraph();
		TopologicalSortOrderDiagraph tsod = new TopologicalSortOrderDiagraph(reverseGraph);
		LinkedListStack<Integer> stack = tsod.TSortOrder();
		while(! stack.isEmpty())
		{
			Integer temp = stack.pop();
			if(! isVisited[temp])
			{
				isVisited[temp] = true;
				depthFirstSearch(temp);
				count++;
			}
		}
	}
	
	private void depthFirstSearch(int source)
	{
		Iterator<Integer> tempIterator = diGraph.adjacentTo(source);
		while(tempIterator.hasNext())
		{
			Integer temp = tempIterator.next();
			if(! isVisited[temp])
			{
				isVisited[temp] = true;
				depthFirstSearch(temp);
			}
		}
		strongComponent[source] = count;
	}
	
	public int[] strongComponents()
	{
		return strongComponent;
	}
}
