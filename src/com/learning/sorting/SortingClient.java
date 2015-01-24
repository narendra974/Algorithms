package com.learning.sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortingClient 
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
			System.out.println("--------  INSERTION SORT --------------------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			InsertionSort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			InsertionSort.sort(stringArray);
			show(stringArray);
		}
		
		{
			System.out.println("--------  SHELL SORT --------------------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			ShellShort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			ShellShort.sort(stringArray);
			show(stringArray);
		}
		
		{
			System.out.println("--------  MERGE SORT --------------------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			MergeSort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			MergeSort.sort(stringArray);
			show(stringArray);
		}
		
		{
			System.out.println("--------  PRACTICAL MERGE SORT --------------------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			PracticalMergeSort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			PracticalMergeSort.sort(stringArray);
			show(stringArray);
		}
		{
			System.out.println("--------  BOTTOM UP MERGE SORT --------------------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			BottomUpMergeSort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			BottomUpMergeSort.sort(stringArray);
			show(stringArray);
		}
		{
			System.out.println("--------  QUICK SORT  --------------------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			QuickSort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			QuickSort.sort(stringArray);
			show(stringArray);
		}
		{
			System.out.println("--------  THREE WAY QUICK SORT  ----------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			ThreeWayQuickSort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			ThreeWayQuickSort.sort(stringArray);
			show(stringArray);
		}
		{
			System.out.println("--------  HEAP SORT  ----------- ");
			String[] stringArray = getStringsFromFile("rsc/words3.txt");
			HeapSort.sort(stringArray);
			show(stringArray);
			stringArray = getStringsFromFile("rsc/tiny.txt");
			HeapSort.sort(stringArray);
			show(stringArray);
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
