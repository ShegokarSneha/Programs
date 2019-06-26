package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

/*
* JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
* NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN
HEADER, PACKAGE,
*
IMPORT STATEMENTS, CLASS DECLARATION, etc
*/

/*********************************************************************
* Compilation: javac -d bin BubbleSort.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.BubbleSort
*
* Purpose: Sort the Array of Integer and String Using Bubble Sort Method
*
* @author Sneha
* @version 1.0
* @since 03-06-2017
*
*********************************************************************/

/*
* JAVA STYLE GUIDE - PACKAGE NAMING STYLE
*/

public class BubbleSort {
	
	/*
	* Driver program to test Bubble Sort class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) 
	{
		System.out.println("*** Program to sort Array Using Bubble Sort Method ***");
		int arr[] = {65, 59, 74, 85, 94, 35, 656};
		String[] str = {"d", "j", "t", "e", "l", "q", "l", "b" };
		
		// To sort String Array
		
		String str1[] = Util.bubbleSortString(str);
		System.out.println("\nSorted String Array: \n");
		
		//To print Array
		
	
		Util.printArrayString(str1);
	
		
		// To sort String Array
		
		System.out.println("\n");
		int temp[] = Util.bubbleSortInteger(arr);
	
		System.out.println("Sorted Integer Array:\n");
		
		//To print Array
		
		
		Util.printArrayInteger(temp);
  }
}

