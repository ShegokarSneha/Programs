package com.bridgelabz.AlgorithumPrograms;

/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines the index of the variable in the array.
*
* @author Sneha
* @version 1.0
* @since 03-06-2017
*
*********************************************************************/

import com.bridgelabz.Util.Util;

public class BinarySearch {
	
	/*
	* Driver program to test Binary Search class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program to Find Target Integer or String in An array By Binary Search ***");
		int arr[] = {65, 59, 74, 85, 94, 35, 656};
		String[] str = {"d", "j", "t", "e", "l", "q", "l", "b" };
		int target = 85;
		String ch = "d";
			
	// To sort the Array in Ascending order
		
		int temp[] = Util.bubbleSortInteger(arr);
		System.out.println("Sorted Integer Array:\n");
		
		// To print Sorted array
		
		Util.printArrayInteger(temp);
		
		int result = Util.binarySearchInteger(arr, target);
		if(result == -1) {
			System.out.println("Element Not in Array");
		}
		else {
		System.out.println("\n");
		System.out.println("Target is Present at Index: "+result);
		}

	// To sort the Array in Ascending order
		
		String str1[] = Util.bubbleSortString(str);
		System.out.println("\nSorted String Array:\n");
		
	// To print sorted array
		
	   Util.printArrayString(str1);
       int total = Util.binarySearchString(str1, ch);
       if(result == -1) {
			System.out.println("Element Not in Array");
		}
		else {
       
       System.out.println("\n");
       System.out.println("Target is Present at Index: "+total);
       }
	}
	}

