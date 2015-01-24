package com.learning.graph;

import com.learning.iterator.Iterator;

public class DiGraphDFSClient 
{
	public static void main(String args[])
	{
		DiGraph diGraph = new DiGraph(7);
		diGraph.addEdge(0, 1);
		diGraph.addEdge(1, 3);
		diGraph.addEdge(1, 2);
		diGraph.addEdge(2, 0);
		diGraph.addEdge(3, 0);
		diGraph.addEdge(3, 2);
		diGraph.addEdge(4, 5);
		diGraph.addEdge(4, 6);
		diGraph.addEdge(5, 1);
		diGraph.addEdge(6, 3);
		diGraph.addEdge(6, 5);
		
		for(int i = 0; i<diGraph.NumberOfVertices(); i++)
		{
			System.out.print( i + " ==> " );
			Iterator<Integer> temp = diGraph.adjacentTo(i);
			while(temp.hasNext())
				System.out.print(temp.next() + " ");
			System.out.println();
		}
		
		DiGraphDFS diGraphDFS = new DiGraphDFS(diGraph, 0);
		DiGraphDFS diGraphDFS2 = new DiGraphDFS(diGraph, 4);
		
		for(int i = 0; i<diGraph.NumberOfVertices(); i++)
		{
			System.out.println( i + " Vertex " + diGraphDFS.isMarked(i));
		}
		
		for(int i = 0; i<diGraph.NumberOfVertices(); i++)
		{
			System.out.println( i + " Vertex From " + diGraphDFS.edgeTo(i));
		}
		
		for(int i = 0; i<diGraph.NumberOfVertices(); i++)
		{
			System.out.println( i + " Vertex " + diGraphDFS2.isMarked(i));
		}
		
		for(int i = 0; i<diGraph.NumberOfVertices(); i++)
		{
			System.out.println( i + " Vertex From " + diGraphDFS2.edgeTo(i));
		}
	}
}
