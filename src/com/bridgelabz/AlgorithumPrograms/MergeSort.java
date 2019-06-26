
/*********************************************************************
* Compilation: javac -d bin MergeSort.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.MergeSort
*
* Purpose: Gives Sorted Array of String and Integer by using Merge Sort.
*
* @author Sneha
* @version 1.0
* @since0 03-06-2019
*
*********************************************************************/

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

public class MergeSort {
	
	/*
	* Driver program to test Merge Sort class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program to sort array By Merge Sort Mehtod ***");
		int arr[] = {65, 59, 74, 85, 94, 35, 656};
		int l = 0, r= arr.length-1;
		Util.mSort(arr, l, r);
		System.out.println("\nSorted Array\n");
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]+ " ");
		}
	}

}
