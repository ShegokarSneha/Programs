package com.bridgelabz.DataStructurePrograms;

import java.util.ArrayList;

import com.bridgelabz.Util.Util;

public class PrimeAnagramStack {


	/**
	* This is the main method which makes use of isPrime and isAnagram method of Util class.
	* @param args Unused.
	* @return Nothing.
	* @exception IOException On input error.
	* @see IOException
	*/
	public static void main(String[] args) {
		System.out.println("*** Program to Print Prime Anagram Numbers in Reverse Order ***");
		//creating stack
		Stack<String> stack = new Stack<String>(); 
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		ArrayList<Integer> anagramList = new ArrayList<Integer>();

		
		//for loop for checking prime from 1 to 1000.
		for(int number = 2;number <= 1000; number++) {
			
			// calling isPrime method to check number is prime or not
			boolean isPrimeNumber = Util.isPrime(number);
			
			if(isPrimeNumber) {
		
				//calling isPalindrome method to check number is palindrome or not.
				primeList.add(number);
				
			}
		}
		System.out.println("\nPrime Numbers Between 0-1000 :");
		
		for(int n = 0; n < primeList.size(); n++) {
			System.out.print(primeList.get(n)+" ");
		}
		System.out.println();
		
		for(int j = 0; j < primeList.size(); j++) {
			for(int k = j+1; k < primeList.size(); k++) {
			
				boolean isAnagramNumber=Util.isAnagramNumber(primeList.get(j),primeList.get(k)); 
				
				if(isAnagramNumber) {
					
					 anagramList.add(primeList.get(j));
					 anagramList.add(primeList.get(k));
				}
			}
		}
		
		for(int n = 0; n < anagramList.size(); n++) {
			stack.push(anagramList.get(n).toString());
		}
		
		// printing in reverse order of stack element. 
		System.out.println("\nReverse order of prime anagram numbers are : ");
		int l = stack.size()-1;
		String arr[][] = new String [15][15];
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				if(l != 0) {
					arr[i][j] = stack.pop();
					System.out.print(arr[i][j]+" ");
					l--;
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}
		
	}

}