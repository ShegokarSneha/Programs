
/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines percentage of win loss.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class Gambler {
	/*
	* The main function is written to test Gambler class
	*/
	
	public static void main(String arg[]) {
		System.out.println("*** Program To Calculate Win And Loss Percent In Gambling Game ***");
		System.out.println("\nEnter $Stake Value: ");
		int $stake = Util.getInputInteger();
		System.out.println("\nEnter $Goal Value to be Achieved: ");
		int $goal = Util.getInputInteger();
		System.out.println("\nEnter No of Times to Play: ");
		int nooftimes = Util.getInputInteger();
		if($goal > $stake) {
			if( nooftimes > 0) {
		Util.calculatePercentWinLoss($stake, $goal, nooftimes);
			}
			else {
				System.out.println("Invalid value of playing");
			}
	}
		else {
			System.out.println("goal is already achived");
		}
	}

}
