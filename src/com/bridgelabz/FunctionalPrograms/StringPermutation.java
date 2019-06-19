/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines permutations of string.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class StringPermutation {
	public static void main(String []args) {
		System.out.println("*** Program For String Permutation using Recursion ***");
		System.out.println("\nEnter String for Permutating:");
		String str  = Util.getInputString();
		Util.permutations(str.toCharArray(),0);
	}
}
