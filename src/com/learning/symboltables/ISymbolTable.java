package com.learning.symboltables;


public interface ISymbolTable<Key, Value>
{	
	/**
	 * Values cannot be null
	 * @param key
	 * @param value
	 */
	public void put(Key key, Value value);
	
	/**
	 * returns null if the key is nor present.
	 * @param key
	 * @return
	 */
	public Value get(Key key);

	public boolean contains(Key key);

	public void delete(Key key);
	
	public boolean isEmpty();
	
	public int size();
	
	public Iterable<Key> keys();

}
