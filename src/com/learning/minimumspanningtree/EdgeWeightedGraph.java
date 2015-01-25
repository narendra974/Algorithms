package com.learning.minimumspanningtree;

import com.learning.collection.Bag;
import com.learning.iterator.Iterator;

public class EdgeWeightedGraph 
{
	private int numberOfVertices;
	private Bag<Edge>[] adjacencyList = null;
	private Bag<Edge> allEdges = null;
	private int numberOfEdges = 0;
	
	@SuppressWarnings("unchecked")
	public EdgeWeightedGraph(int V)
	{
		this.numberOfVertices = V;
		allEdges = new Bag<Edge>();
		adjacencyList = new Bag[this.numberOfVertices];
		for(int i=0; i < this.numberOfVertices ; i++ )
		{
			adjacencyList[i] = new Bag<Edge>();
		}
	}
	
	public int getVertices()
	{
		return this.numberOfVertices;
	}
	
	public int getNumberOfEdges()
	{
		return this.numberOfEdges;
	}
	
	public void addEdge(Edge edge)
	{
		int v = edge.either();
		int w = edge.other(v);
		adjacencyList[v].addItem(edge);
		adjacencyList[w].addItem(edge);
		allEdges.addItem(edge);
		numberOfEdges++;
	}
	
	public Iterator<Edge> getAdjacencyList(int v)
	{
		return adjacencyList[v].getIterator();
	}

	public Iterator<Edge> getEdges()
	{
		return allEdges.getIterator();
	}
}
