package com.chapter1.unionfind;

/**
 * @author RSG
 *
 */
public interface UF {

	/**
	 * Add a connection between p and q
	 * 
	 * @param p
	 * @param q
	 */
	public void union(int p, int q);

	/**
	 * Component identifier for a given site
	 * 
	 * @param p
	 * @return identifier from p
	 */
	public int find(int p);

	/**
	 * Return if the sites are connected
	 * 
	 * @param p
	 * @param q
	 * @return true if p and q are in the same component
	 */
	public boolean connected(int p, int q);

	/**
	 * Count components
	 * 
	 * @return number of components
	 */
	public int count();
}
