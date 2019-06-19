package com.bridgelabz.DataStructurePrograms;

import java.util.ArrayList;

import com.bridgelabz.Util.Util;

public class PrimeAnagram {
	
	static ArrayList<Integer> primeList=new ArrayList<Integer>();
	static ArrayList<Integer> anagramList=new ArrayList<Integer>();
	static ArrayList<Integer> notAnagramList=new ArrayList<Integer>();

    public static void primeAnagram() {
    	boolean flag = false;
	    for(int i = 2; i <= 1000; i++)
	    {
	      flag = Util.isPrime(i);
	      
	      if(flag)
	    	  primeList.add(i);
	    }
	    
	    for(int i=0;i<primeList.size();i++)
	    {
	    	for(int j=i+1;j<primeList.size();j++)
	    	{
	    		if(Util.isAnagramNumber(primeList.get(i),primeList.get(j)))//anagram calling 
	    		{
	    			//System.out.println(primeList.get(i)+" "+primeList.get(j));
	    			
	    			anagramList.add(primeList.get(i));
	    			anagramList.add(primeList.get(j));
	    		}
	    		
	    	}
	    }
	   
	    displayList();
	    }
    
    
    public static void displayList() {
    	String[][] primeAnagramArray = new String [15][15];
    	int index = 0;
    		for(int i = 0; i < 15 ; i++) {
    	
    		for(int j = 0; j < 15; j++) {
    			if(anagramList.size() != index) {
    			primeAnagramArray[i][j] = anagramList.get(index).toString();
    			System.out.print(primeAnagramArray[i][j]+" ");
    			index++;
    			}
    			else {
    				System.out.print("");
    			}
    			}
    		System.out.println();
    		}
    		
    }		
		
	public static void main(String[] args) {
		System.out.println("*** Program to print Prime Anagram Numbers Between 0-1000 In 2D Array ***");
		System.out.println("\nPrime Anagram Numbers 0-1000 :");
		PrimeAnagram.primeAnagram();
	}
}
