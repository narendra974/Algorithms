package com.learning.minimumspanningtree;

import com.learning.iterator.Iterator;

public class MSTClient 
{
	public static void main(String args[])
	{
		Edge edge1 = new Edge(0, 7, 0.16);
		Edge edge2 = new Edge(2, 3, 0.17);
		Edge edge3 = new Edge(1, 7, 0.19);
		Edge edge4 = new Edge(0, 2, 0.26);
		Edge edge5 = new Edge(5, 7, 0.28);
		Edge edge6 = new Edge(1, 3, 0.29);
		Edge edge7 = new Edge(1, 5, 0.32);
		Edge edge8 = new Edge(2, 7, 0.34);
		Edge edge9 = new Edge(4, 5, 0.35);
		Edge edge10 = new Edge(1, 2, 0.36);
		Edge edge11 = new Edge(4, 7, 0.37);
		Edge edge12 = new Edge(0, 4, 0.38);
		Edge edge13 = new Edge(6, 2, 0.40);
		Edge edge14 = new Edge(3, 6, 0.52);
		Edge edge15 = new Edge(6, 0, 0.58);
		Edge edge16 = new Edge(6, 4, 0.93);
		
		EdgeWeightedGraph edgeWeightedGrapgh = new EdgeWeightedGraph(8);
		edgeWeightedGrapgh.addEdge(edge1);
		edgeWeightedGrapgh.addEdge(edge2);
		edgeWeightedGrapgh.addEdge(edge3);
		edgeWeightedGrapgh.addEdge(edge4);
		edgeWeightedGrapgh.addEdge(edge5);
		edgeWeightedGrapgh.addEdge(edge6);
		edgeWeightedGrapgh.addEdge(edge7);
		edgeWeightedGrapgh.addEdge(edge8);
		edgeWeightedGrapgh.addEdge(edge9);
		edgeWeightedGrapgh.addEdge(edge10);
		edgeWeightedGrapgh.addEdge(edge11);
		edgeWeightedGrapgh.addEdge(edge12);
		edgeWeightedGrapgh.addEdge(edge13);
		edgeWeightedGrapgh.addEdge(edge14);
		edgeWeightedGrapgh.addEdge(edge15);
		edgeWeightedGrapgh.addEdge(edge16);
		
		KruskalMST mst = new KruskalMST(edgeWeightedGrapgh);
		Iterator<Edge> iterator = mst.getMSTEdges();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().toString());
		}
		
	}
}
