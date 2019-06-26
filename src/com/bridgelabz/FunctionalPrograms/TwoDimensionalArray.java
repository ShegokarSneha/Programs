
/*********************************************************************
* Compilation: javac -d bin TwoDimensionalArray.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.TwoDimensionalArray
*
* Purpose: Print two diementional array.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class TwoDimensionalArray {
	/*
	* The main function is written to test Two Dimensional Array class
	*/
	
	public static void main(String args[]) {
		
		System.out.println("*** Program for 2D Array ***");
		int row, column;
		System.out.println("\nEnter No of Rows:");
		row = Util.getInputInteger();
		System.out.println("\nEnter No of Columns:");
		column = Util.getInputInteger();
		int [][] arr = new int [row][column];
		System.out.println("\nEnter Array Elements: ");
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				arr[i][j] = Util.getInputInteger();
			}
		}
		Util.print2DArray(arr, row, column);
	
	}
	}
	
