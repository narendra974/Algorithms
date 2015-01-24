package com.learning.selection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.learning.sorting.SelectionSort;

	public class SelectionClient 
	{	
		public static void main(String[] args)
		{
			{
				System.out.println("--------  SELECTION SORT --------------------- ");
				String[] stringArray = getStringsFromFile("rsc/words3.txt");
				SelectionSort.sort(stringArray);
				show(stringArray);
				stringArray = getStringsFromFile("rsc/tiny.txt");
				SelectionSort.sort(stringArray);
				show(stringArray);
			}
			{
				System.out.println("--------  SELECTION --------------------- ");
				String[] stringArray = getStringsFromFile("rsc/words3.txt");
				for(int i = 0; i<stringArray.length; i++)
					System.out.print(Selection.select(stringArray, i) + " ");
				System.out.println();
				stringArray = getStringsFromFile("rsc/tiny.txt");
				for(int i = 0; i<stringArray.length; i++)
					System.out.print(Selection.select(stringArray, i) + " ");
				System.out.println();
			}
			System.out.println("--------------------------------------------- ");
		}
		
		private static void show(String[] stringArray) 
		{
			for(int i =0; i<stringArray.length; i++)
			{
				System.out.print(stringArray[i] + " ");
			}
			System.out.println();
			
		}
		
		private static String[] getStringsFromFile(String filename)
		{
			try 
			{
				FileInputStream fis = new FileInputStream(filename); // rsc/words3.txt
				Scanner scanner = new Scanner(fis);
				ArrayList<String> listStrings = new ArrayList<String>();
				while(scanner.hasNextLine())
					listStrings.add(scanner.nextLine());
				String[] stringArray = new String[listStrings.size()];
				for(int i = 0; i < listStrings.size(); i++)
					stringArray[i] = listStrings.get(i);
				fis.close();
				scanner.close();
				return stringArray;
			}
			catch (FileNotFoundException e) 
			{	
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		}
	}

