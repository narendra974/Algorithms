package com.learning.graph;

public class SCCClient {

	public static void main(String[] args) 
	{
		DiGraph diGraph = new DiGraph(13);
		diGraph.addEdge(4, 2);
		diGraph.addEdge(2, 3);
		diGraph.addEdge(3, 2);
		diGraph.addEdge(6, 0);
		diGraph.addEdge(0, 1);
		diGraph.addEdge(2, 0);
		diGraph.addEdge(11, 12);
		diGraph.addEdge(12, 9);
		diGraph.addEdge(9, 10);
		diGraph.addEdge(9, 11);
		diGraph.addEdge(7, 9);
		diGraph.addEdge(10, 12);
		diGraph.addEdge(11, 4);
		diGraph.addEdge(4, 3);
		diGraph.addEdge(3, 5);
		diGraph.addEdge(6, 8);
		diGraph.addEdge(8, 6);
		diGraph.addEdge(5, 4);
		diGraph.addEdge(0, 5);
		diGraph.addEdge(6, 4);
		diGraph.addEdge(6, 9);
		diGraph.addEdge(7, 6);
		
		StrongConnectedComponents sccDiGraph = new StrongConnectedComponents(diGraph);
		int[] scc = sccDiGraph.strongComponents();
		
		for(int i=0; i<diGraph.NumberOfVertices(); i++)
		{
			System.out.println( i + " " + scc[i]);
		}
	}

}
