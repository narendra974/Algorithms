package com.learning.shuffle;

public class ShuffleClient 
{
	public static void main(String[] args) 
	{
		Integer[] objects = new Integer[10];
		for(int i = 0 ; i < objects.length; i++)
		{
			objects[i] = new Integer(i);
		}
		System.out.println("---------- BEFORE SHUFFLING  ----------------- ");
		for(int i = 0 ; i < objects.length; i++)
		{
			System.out.print( objects[i].intValue() + " ");
		}
		System.out.println();
		KnuthShuffle.shuffle(objects);
		System.out.println("---------- SHUFFLING THE SORTED ORDER --------- ");
		for(int i = 0 ; i < objects.length; i++)
		{
			System.out.print( objects[i].intValue() + " ");
		}
		System.out.println("\n------------------- DONE DONE ------- --------- ");
	}
}
