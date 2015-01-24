package com.learning.stack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 * Out put of each block should be 
 * to be not that or be
 * 
 * @author narendra
 *
 */
public class StackClient 
{

	public static void main(String[] args) 
	{
		{
			IStack<String> stack = new LinkedListStack<>();
			try
			{
				FileInputStream fis = new FileInputStream("rsc/tobe.txt");
				Scanner scanner = new Scanner(fis);
				while(scanner.hasNext())
				{
					String str = scanner.next();
					if(str.equals("-"))
					{
						System.out.print(stack.pop() + " ");
					}
					else
					{
						stack.push(str);
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
		
		
		{
			IStack<String> stack = new ArrayStack<>();
			try
			{
				FileInputStream fis = new FileInputStream("rsc/tobe.txt");
				Scanner scanner = new Scanner(fis);
				while(scanner.hasNext())
				{
					String str = scanner.next();
					if(str.equals("-"))
					{
						System.out.print(stack.pop() + " ");
					}
					else
					{
						stack.push(str);
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
