package com.learning.queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Out put of each block should be 
 * to be or not to be
 * 
 * @author narendra
 *
 */
public class QueueClient 
{
	public static void main(String[] args) 
	{
		{
			IQueue<String> queue = new LinkedListQueue<>();
			try
			{
				FileInputStream fis = new FileInputStream("rsc/tobe.txt");
				Scanner scanner = new Scanner(fis);
				while(scanner.hasNext())
				{
					String str = scanner.next();
					if(str.equals("-"))
					{
						System.out.print(queue.deque() + " ");
					}
					else
					{
						queue.enque(str);
					}
				}
				System.out.println();
				scanner.close();
				fis.close();
			}
			catch(FileNotFoundException fnf)
			{
				fnf.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
