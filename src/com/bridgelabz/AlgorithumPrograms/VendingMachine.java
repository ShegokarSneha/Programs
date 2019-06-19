
/*
* JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
* NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN
HEADER, PACKAGE,
*
IMPORT STATEMENTS, CLASS DECLARATION, etc
*/

/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines whether or not n is prime.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

/*
* JAVA STYLE GUIDE - PACKAGE NAMING STYLE
*/

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

/*
* JAVA STYLE GUIDE - IMPORT STATEMENtS
* NOTE : NO WILDCARD IMPORTS i.e. import java.lang.*;
* NO LINE WRAPING - APPEARS IN ONE LINE
*/



public class VendingMachine {
	
//***************** Vending Machine ******************//

	
	/**
	* Function takes three inputs array of coins and array length and change amount
	* @param nothing
	* @return minimum no of note count to return change
	*/
	
	public static int minimumCoins(int Coins[],int n,int amount){
		int count = 0;
		
		// for loop to check the notes till array length
		
		for( int i=0; i< n; i++ ) {
			while(amount >= Coins[i])
	          {
	            //while loop is needed since one coin can be used multiple times
	            amount= amount - Coins[i];
	            count++;
	            System.out.print(Coins[i]+" ");
	           }
			}
		System.out.println("\n");
		return count;
		}
	
	/*
	* Driver program to test Vending Machine class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		
		System.out.println("*** Program for Return The Change ***");
		int [] Coins = {1000, 500, 100, 50, 10, 5, 2, 1};
		int arrayLen = Coins.length;
		System.out.println("\nEnter Required Change :");
		int change = Util.getInputInteger();
		System.out.println("\nList of Notes Return as A Change:");
		int result = minimumCoins(Coins,arrayLen, change);
		System.out.println("No of Notes Required to Return Change: " +result);
	}
	
	}
				
		
