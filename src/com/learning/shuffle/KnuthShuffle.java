package com.learning.shuffle;

import java.util.Random;

public class KnuthShuffle 
{
	
	public static void shuffle(Object[] objects)
	{
		Random random = new Random();
		for(int i = 1; i < objects.length; i++)
		{
			int r = random.nextInt(i);
			Object temp = objects[r];
			objects[r] = objects[i];
			objects[i] = temp;
		}
	}
}
