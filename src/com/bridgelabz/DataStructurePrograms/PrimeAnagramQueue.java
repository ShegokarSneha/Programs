package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class PrimeAnagramQueue {
	public static void main(String[] args) {
		System.out.println("*** Program For Prime Anagram Number Using Queue ***");
		//creating stack
		Queue<Integer> queue = new Queue<Integer>(); 
		
		//for loop for checking prime from 1 to 1000.
		for(int number=1;number<=1000;number++) {
			
			// calling isPrime method to check number is prime or not
			boolean isPrimeNumber = Util.isPrime(number);
			
			if(isPrimeNumber) {
				
				//calling isPalindrome method to check number is palindrome or not.
				boolean isPalindromeNumber=Util.isPalindrome(number); 
				
				if(isPalindromeNumber) {
					 queue.enQueue(number);
				}
				queue.display();
			}
		}
	}

}
