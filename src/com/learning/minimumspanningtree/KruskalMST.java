package com.learning.minimumspanningtree;

import com.learning.collection.Bag;
import com.learning.iterator.Iterator;
import com.learning.priorityqueue.MinimumPriporityQueue;
import com.learning.unionfind.PathCompressionWeightedUnionFind;

public class KruskalMST 
{
	MinimumPriporityQueue<Edge> minPQ = null;
	PathCompressionWeightedUnionFind unionFind = null;
	Bag<Edge> mstEdges = null;
	
	public KruskalMST(EdgeWeightedGraph edgeWeightedGraph) 
	{
		minPQ = new MinimumPriporityQueue<>(edgeWeightedGraph.getNumberOfEdges());
		unionFind = new PathCompressionWeightedUnionFind(edgeWeightedGraph.getVertices());
		mstEdges = new Bag<Edge>();
		
		Iterator<Edge> allGraphEdges = edgeWeightedGraph.getEdges();
		while(allGraphEdges.hasNext())
			minPQ.insert(allGraphEdges.next());
		
		while(!minPQ.isEmpty() && mstEdges.size() < edgeWeightedGraph.getVertices() - 1)
		{
			Edge edge = minPQ.deleteMinimum();
			int v = edge.either();
			int w = edge.other(v);
			if(! unionFind.isConnected(v, w))
			{
				unionFind.union(v, w);
				mstEdges.addItem(edge);
			}
		}
	}
	
	public Iterator<Edge> getMSTEdges()
	{
		return this.mstEdges.getIterator();
	}
}
