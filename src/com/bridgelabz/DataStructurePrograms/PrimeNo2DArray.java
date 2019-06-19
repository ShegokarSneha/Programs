package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class PrimeNo2DArray {
	public static void main(String[] args) {
		int [][] twoDim = new int[10][100];
		
		int k=1;
		//This for loop to initialize the value of 2d array from 1 to 1000.
		for(int i=0;i<twoDim.length;i++) {
			for(int j=0;j<twoDim[i].length;j++) {
				twoDim[i][j]=k++;
			}
		}
		
		System.out.println("Prime numbers in 2D arrays are : \n");
		
		// for loop to display the prime number in 2d array.
		for(int i=0;i<twoDim.length;i++) {
			for(int j=0;j<twoDim[i].length;j++) {

				// calling isPrime method to check number is prime or not
				boolean isPrimeNumber = Util.isPrime(twoDim[i][j]);
				
				//if number is prime then printing
				if(isPrimeNumber) {
					System.out.print(twoDim[i][j]+"\t");
				}else 	
					System.out.print("");
			}
			System.out.println();
		}
	}

}
