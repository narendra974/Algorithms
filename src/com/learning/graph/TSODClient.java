package com.learning.graph;

import com.learning.stack.LinkedListStack;

public class TSODClient 
{
	public static void main(String args[])
	{
		DiGraph diGraph = new DiGraph(7);
		diGraph.addEdge(0, 5);
		diGraph.addEdge(0, 2);
		diGraph.addEdge(0, 1);
		diGraph.addEdge(3, 6);
		diGraph.addEdge(3, 5);
		diGraph.addEdge(3, 4);
		diGraph.addEdge(5, 2);
		diGraph.addEdge(6, 4);
		diGraph.addEdge(6, 0);
		diGraph.addEdge(3, 2);
		diGraph.addEdge(1, 4);
		
		TopologicalSortOrderDiagraph tsodDigraph = new TopologicalSortOrderDiagraph(diGraph);
		LinkedListStack<Integer> order = tsodDigraph.TSortOrder();
		
		while(! order.isEmpty())
		{
			System.out.println(order.pop());
		}
	}
}
