package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class PalindromeChecker {
	//Creating dequeue
        Deque<Character> deque = new Deque<Character>();
	
	/**
	 * This method is used to check given string is palindrome or not.
	 * @param string This is the first parameter of isPalindrome method.
	 * @return boolean This returns true if string ia palindrome otherwise return false.
	 */
	public boolean isPalindrome(String string) {
		//for loop for add string into deque.
		for(int i = 0 ; i < string.length() ; i++) {
			char ch = string.charAt(i);
			deque.addRear(ch);
		}
		
		String temp = "";
		
		//for loop for remove string from deque
		for(int i = 0 ; i < string.length() ; i++) {
			temp = temp + deque.removeRear();
		}
		
		//string is palindrome or not
		if(string.equals(temp)) {
			return true;
		}
		
		return false;
	}
	
	/**
	* This is the main method which makes use of isPalindrome method.
	* @param args[0] Unused.
	* @return Nothing.
	* @exception IOException On input error.
	* @see IOException
	*/
	public static void main(String[] args) {
		
		System.out.println("Please enter the string : ");
		String inputString = Util.getInputString();
		
		// Creating object
		PalindromeChecker palindromeChecker = new PalindromeChecker();
		
		//calling isPalindrome method.
		boolean result = palindromeChecker.isPalindrome(inputString);
		
		if(result) {
			System.out.println("String is palindrome.");
		}else {
			System.out.println("String is not palindrome.");
		}
		
	}
}