
/*********************************************************************
* Compilation: javac -d bin InsertionSort.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.InsertionSort
*
* Purpose: Sort the array of String And Integer By using Insertion Sort Method.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

public class InsertionSort {
	
	/*
	* Driver program to test Insertion Sort class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program to Sort Array Using Insertion Sort ***");
		int arr[] = {65, 59, 74, 85, 94, 35, 656};
		String[] str = {"d", "j", "t", "e", "l", "q", "l", "b" };
		String str1[] = Util.insertionSortString(str);
		System.out.println("\nSorted String Array: \n");
		Util.printArrayString(str1);
		System.out.println("\n");
		int temp[] = Util.insertionSortInteger(arr);
		System.out.println("Sorted Integer Array:\n");
		Util.printArrayInteger(temp);
		}

}
