package com.learning.unionfind;

public class UnionFindClient {

	public static void main(String[] args) 
	{
		{
			System.out.println("\n***************************QUICK FIND **********************************\n");
			
			// To Check the QuickFind Implementation.
			QuickFindImpl quickFindImpl = new QuickFindImpl(8);
			quickFindImpl.union(1, 4);
			quickFindImpl.union(4, 5);
			quickFindImpl.union(2, 3);
			quickFindImpl.union(2, 6);
			quickFindImpl.union(3, 6);
			quickFindImpl.union(3, 7);
			System.out.println(quickFindImpl.toString());
			System.out.println("0 and 2 should not be connected isConnected(0, 2) = " + quickFindImpl.isConnected(0, 2));
			System.out.println("0 and 1 should not be connected isConnected(0, 1) = " + quickFindImpl.isConnected(0, 1));
			System.out.println("4 and 5 should be connected isConnected(4, 5) = " + quickFindImpl.isConnected(4, 5));
			System.out.println("6 and 7 should be connected isConnected(6, 7) = " + quickFindImpl.isConnected(6, 7));
		}
		
		System.out.println("\n***************************QUICK UNINON **********************************\n");
		
		{ 
			// To Check the Quick Union Implementation.
			QuickUnionImpl quickUnionImpl = new QuickUnionImpl(8);
			quickUnionImpl.union(1, 4);
			quickUnionImpl.union(4, 5);
			quickUnionImpl.union(2, 3);
			quickUnionImpl.union(2, 6);
			quickUnionImpl.union(3, 6);
			quickUnionImpl.union(3, 7);
			System.out.println(quickUnionImpl.toString());
			System.out.println("0 and 2 should not be connected isConnected(0, 2) = " + quickUnionImpl.isConnected(0, 2));
			System.out.println("0 and 1 should not be connected isConnected(0, 1) = " + quickUnionImpl.isConnected(0, 1));
			System.out.println("4 and 5 should be connected isConnected(4, 5) = " + quickUnionImpl.isConnected(4, 5));
			System.out.println("6 and 7 should be connected isConnected(6, 7) = " + quickUnionImpl.isConnected(6, 7));		
		}
		
		System.out.println("\n***************************QUICK WEIGHTED UNINON ************************\n");
		
		{ 
			// To Check the Quick Union Implementation.
			WeightedUnionFind weightedUnionFind = new WeightedUnionFind(8);
			weightedUnionFind.union(1, 4);
			weightedUnionFind.union(4, 5);
			weightedUnionFind.union(2, 3);
			weightedUnionFind.union(2, 6);
			weightedUnionFind.union(3, 6);
			weightedUnionFind.union(3, 7);
			System.out.println(weightedUnionFind.toString());
			System.out.println("0 and 2 should not be connected isConnected(0, 2) = " + weightedUnionFind.isConnected(0, 2));
			System.out.println("0 and 1 should not be connected isConnected(0, 1) = " + weightedUnionFind.isConnected(0, 1));
			System.out.println("4 and 5 should be connected isConnected(4, 5) = " + weightedUnionFind.isConnected(4, 5));
			System.out.println("6 and 7 should be connected isConnected(6, 7) = " + weightedUnionFind.isConnected(6, 7));		
		}
		
		System.out.println("\n****************PATH COMPRESSION WEIGHTED UNION *********************\n");
		
		{ 
			// To Check the Quick Union Implementation.
			PathCompressionWeightedUnionFind pathCompressionWeightedUnionFind = new PathCompressionWeightedUnionFind(8);
			pathCompressionWeightedUnionFind.union(1, 4);
			pathCompressionWeightedUnionFind.union(4, 5);
			pathCompressionWeightedUnionFind.union(2, 3);
			pathCompressionWeightedUnionFind.union(2, 6);
			pathCompressionWeightedUnionFind.union(3, 6);
			pathCompressionWeightedUnionFind.union(3, 7);
			System.out.println(pathCompressionWeightedUnionFind.toString());
			System.out.println("0 and 2 should not be connected isConnected(0, 2) = " + pathCompressionWeightedUnionFind.isConnected(0, 2));
			System.out.println("0 and 1 should not be connected isConnected(0, 1) = " + pathCompressionWeightedUnionFind.isConnected(0, 1));
			System.out.println("4 and 5 should be connected isConnected(4, 5) = " + pathCompressionWeightedUnionFind.isConnected(4, 5));
			System.out.println("6 and 7 should be connected isConnected(6, 7) = " + pathCompressionWeightedUnionFind.isConnected(6, 7));		
		}
	}

}
