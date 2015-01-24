package com.learning.unionfind;

public interface IUnionFind 
{
	/**
	 * connects from p to q
	 * @param p 
	 * @param q
	 */
	void union(int p, int q);
	
	/**
	 * Checks if p is connected to q
	 * @param p
	 * @param q
	 * @return true if connected else false;
	 */
	boolean isConnected(int p, int q);
	
	/**
	 * finds whether the given p is in a particular Component
	 * @param p
	 * @return
	 */
	int find(int p);
	
	/**
	 * counts number of strong components in the 
	 * @return
	 */
	int count(); 
}
