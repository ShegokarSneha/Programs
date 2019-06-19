
/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines percentage of head and tail.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class CoinFlip {
	/*
	* The main function is written to test Percentage of Head Tail class
	*/ 
	
	public static void main(String args[]) {
		
		System.out.println("*** Program To Calculate Percentage Of Head Tail ***");
		int choice = 0;
		do {
	      System.out.println ("\nEnter No of times coin flip:");
	      int n = Util.getInputInteger();
	      Util.percentFlip(n);
	      System.out.println("\nPress 1 to continue");
	      choice = Util.getInputInteger();
	      }while(choice == 1);
		
	}
}
