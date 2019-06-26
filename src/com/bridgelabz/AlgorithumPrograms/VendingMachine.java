
/*********************************************************************
* Compilation: javac -d bin VendingMachine.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.VendingMachine
*
* Purpose: Gives the Minimum No of Notes Gives as a change and count of notes.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

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
				
		
