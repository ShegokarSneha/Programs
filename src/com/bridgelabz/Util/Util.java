package com.bridgelabz.Util;

import java.util.Random;
import java.util.Scanner;

public class Util {
	
	static Scanner sc = new Scanner(System.in);
	
//***************** To Get User Integer *************************//	
	
	/**
	* Function to get input from user
	* @param nothing
	* @return integer number
	*/
	
	public static int getInputInteger() {
		int number = sc.nextInt();
		return number;
	}
	
//***************** To Get User Double *************************//
	
	/**
	* Function to get input from user
	* @param nothing
	* @return double number
	*/
	
	public static double getInputDouble() {
		double number = sc.nextInt();
		return number;
	}
	
//***************** To Get User Long *************************//		
	
	/**
	* Function to get input from user
	* @param nothing
	* @return long number
	*/
	
	public static long getInputLong() {
		long number = sc.nextInt();
		return number;
	}

//***************** To Get User String *************************//	
	
	/**
	* Function to get input from user
	* @param nothing
	* @return string
	*/
	
	public static String getInputString() {
		String string = sc.nextLine();
		return string;
	}
	
	
//***************** Print Integer Array *************************//
    
    /**
   	* Function to Print Integer array
   	* @param array the Integer array
   	* @return Nothing
   	*/
	
 	public static void printArrayInteger(int[] temp) {
 		for (int i = 0 ; i < temp.length ; i++)
 		{
 			System.out.print(temp[i]+ " ");
 	    }
 		
 	}

 //***************** Print String Array **********************//

  	/**
   	* Function to Print String array
   	* @param array the String array
   	* @return Nothing
   	*/
 	
 	public static void printArrayString(String[] str1) {
 		for (int i = 0; i < str1.length; i++ )
 		{
 			System.out.print(str1[i]+ " ");
 		}
 	}
 	
//********************Percentage of Number **********************//
 	/**
 	* Function to Calculate percentage of number 
 	* @param Nothing
 	* @return elapsed Time
 	*/
 		
 	public static float percentCalculation(float high, float low) {
 		float result = (float)(high*100)/low;
 		return result;
 	}	
	
//******************* Binary Swap Nibbles *********************//

	/**
   	* Function to swap Nibbles of Binary number   	
   	* * @param String of Binary Number
   	* @return Nothing
   	*/
	
	public static void swapNibbles(String Binary) {
		String FirstNibble = "";
		String SecondNibble = "";
		
		// for loop for storing first nibble in second nibble
		
		for(int i = 0; i < Binary.length()/2 ; i++) {
			SecondNibble =SecondNibble + (Binary.charAt(i));
		}
		System.out.println("\nSecond Nibble is: " +SecondNibble);
		
		// for loop for storing second nibble in first nibble
		
		for(int j = Binary.length()/2; j < Binary.length() ; j++) {
			FirstNibble = FirstNibble + (Binary.charAt(j));
		}
		System.out.println("\nFirst Nibble is: " +FirstNibble);
		Binary = FirstNibble + SecondNibble;
		System.out.println("\nBinary Number After Reversing Nibbles:" + Binary);
		int result = Util.binaryRepresentation(Binary);
		System.out.println("\nThe Decimal Equivalent Of Reverse Binary Number is:" +result);
	}
	
/************* To Append Zero in Binary number ****************/

		/**
	   	* Function to Append Zero in Binary number
	   	* @param String of Binary Number
	   	* @return Nothing
	   	*/
		
	public static  void appendZero(String array) {
			
		// while loop for checking the size of number
			
		while(array.length() < 8) {
			array = "0" + array;
			}
		swapNibbles(array);
	}
	
//********************** Binary Conversion **********************//	
	
	/**
	* Function to Convert decimal no to Binary equivalent
 	* @param decimal number
 	* @return Equivalent binary number
	*/
		
	public static String toBinary(int deci) {
		int number;
		String binary ="";
			
		// while loop for diving number the till equal to zero
			
		while(deci > 0) {
			number = deci % 2;
	        binary = number + "" +binary;
	        deci = deci / 2;
	     }
	return binary;
	}
	
/********************* Decimal Conversion **********************/
	
	/**
	* Function to Calculate decimal number from binary number
	* @param String number
	* @return decimal Equivalent of binary number
  	*/
		
	public static int binaryRepresentation(String binary) {
		int total=0, count= binary.length()-1;
		String str = binary;
			
			// for loop for binary number
			
		for(int i = 0; i < binary.length() ; i++ ) {
			if((int) ((str.charAt(i))-48 )== 1) {
				total = (int)(total+ Math.pow(2,count));
				count--;
				}
			else {
				count--;
			}
		}
	return total;
	}	
	
//********************** Anagram String *********************//
	/**
	* Function to check for Anagram
	* @param two Strings to check for Anagram
	* @return a boolean value stating that Strings are Anagram or not.
	*/
	
	public static boolean isAnagram(String str1, String str2 ) {
		int[] count1 = new int [26];
		int[] count2 = new int [26];
		
		// calling charactercount funtion
		
		count1 = characterCount(str1);
		count2 = characterCount(str2);
		
		//for loop for checking characters in two string are equal or not 
		
		for(int i = 0 ; i < count2.length ; i++ )
		{
			if(count1[i] != count2[i])
			{
				return false;
			}
		}
	return true;
	}
	
     // To find character count in the String  //
	
	/**
	* Function to count the Characters present in the string
	* @param String to count characters
	* @return integer array of character count.
	*/
	
	public static int[] characterCount (String str1) {
		int [] count = new int [26];
		char[] ch = str1.toCharArray();
		
		//for loop for counting the characters in the string
		
		for(int i = 0 ; i < ch.length ; i++)
		{
			if(ch[i] >= 65 && ch[i] <= 90) 
			{
				count[ch[i]-65]++;
				}
			else if(ch[i] >= 97 && ch[i] <= 122)
			{
				count[ch[i]-97]++;
			    }
			}
		return count;
		}
	
//*********************** Prime Number **************************//
	
	/**
	* Function to check for prime
	* @param number the number to check for prime
	* @return a boolean value stating that number is prime or not.
	*/
	
	public static boolean isPrime (int number) {
		int count = 0;
		
		// for loop for getting numbers from 2 to last number 
		
		for(int j = 2 ; j < number ; j++)
        {
			// checking for prime number condition 
			
            if(number % j == 0)
            {
                count++;
                break;
            }
        }
		if(count > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
//******************* Palindrome Number ************************//
	/**
	* Function to check for Palindrome number
	* @param number the number to check for palindrome
	* @return nothing
	*/
	
    public static boolean isPalindrome(int prime) {
		int temp = 0, rem = 0 ;
		int org = prime ;
		
		// for loop To check number is Palindrome or Not
		
    	for (int j = 0; j <= prime; j++)
    	{
    		rem = prime%10;
    		temp = temp*10 + rem;
    		prime = prime/10;
    	}
    	
    	// To check and print Palindrome number
    	
    	if(org == temp)
    	{
    		return true;
    		}
    	else {
    		return false;
    	}
    	}
    
//********************** Anagram number *********************//
    
    public static boolean isAnagramNumber(int n1, int n2) 
	{
		int[] n1count = counting(n1);
		int[] n2count = counting(n2);
		for (int i = 0; i < n2count.length; i++)
		{
			if (n1count[i] != n2count[i]) 
			{
				return false;
			}
		}
		return true;
	}

  private static int[] counting(int n1) {
	int[] count = new int[10];
	int temp = n1;
	while (temp != 0) 
	{
		int rem = temp % 10;
		count[rem]++;
		temp = temp / 10;
	}
	return count;
}
    
//*************** Bubble Sort Method for Integer *****************//
    
    /**
	* Function to sort integer array by using Bubble sort method
	* @param array the integer array to sort in ascending order
	* @return array
	*/
    
    
    public static int[] bubbleSortInteger(int[] arr) {
		int temp;
		
		//for loop for sorting array
		
		for(int i = 0; i < arr.length; i++)
	       {
	           for(int j = 0; j < (arr.length-i-1); j++)
	           {
	         // comparing array elements
	        	   
	               if(arr[j] > arr[j+1])
	               {
	                   temp = arr[j];
	                   arr[j] = arr[j+1];
	                   arr[j+1] = temp;
	               }
	           }
	       }
		return arr;
	}
 //***************Bubble Sort Method for Integer*****************//
    
    /**
   	* Function to sort String array by using Bubble sort method
   	* @param array the string array to sort in ascending order
   	* @return String
   	*/
    
    public static String[] bubbleSortString(String[]str) {
    	String temp;
    	
    	//for loop for String sorting array
    	
    	for (int i = 0; i < str.length; i++)
    	{
    		for (int j = i + 1; j < str.length; j++)
    		{
    			
    			// comparing two strings
    			
    			if (str[j].compareTo(str[i]) < 0)
    			{
    				temp = str[i];
    				str[i] = str[j];
    				str[j] = temp;
    				}
    			}
    		}
    	return str;
    	}
    
//************** Binary Search Method for Integer ****************//
    
    /**
   	* Function to find target value in array by using Binary search method
   	* @param array the Integer array
   	* @return Integer index value
   	*/
    
	public static int binarySearchInteger(int[] arr, int target)
		 {
		   int start = 0; 
		   int end = arr.length - 1;
		    
    //while for checking array till finding target value
		    
		   while (start <= end) {
			   int mid = (start + end) / 2;
			   if (target == arr[mid]) {
				   return mid;
				   }
			   else if (target < arr[mid]) {
				   end = mid - 1;
				   }
			   else {
				   start = mid + 1;
				   }
			   }
		   return -1;
		   }
		 
//************** Binary Search Method for String *****************//
    
    /**
   	* Function to fins target String in array by using Binary search method
   	* @param array the String array
   	* @return Integer index value
   	*/
		 
	public static int binarySearchString(String[] arr, String target) {
		int start = 0;
		int end = arr.length - 1;
		
		 // while for checking array till finding target value
		
		while (start <= end) {
			int mid = (start + end) / 2;
			int comp = target.compareTo(arr[mid]);
			if (comp == 0) {
				return mid;
				}
			else if (comp < 0) {
				end = mid - 1;
				}
			else {
				start = mid + 1;
				}
			}
		return -1;
		}
	
//************** Insertion Sort Method for Integer ****************//
    
    /**
   	* Function to sort Integer array by using Insertion sort method
   	* @param array the Integer array
   	* @return Integer Integer Array value
   	*/
	
	public static int[] insertionSortInteger(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			int key = arr[i];
			int j = i-1;
			
			// while loop for sorting array till end
			
			while(j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j]; 
	            j = j - 1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
		
//************** Insertion Sort Method for String *****************//
    
    /**
   	* Function to sort String array by using Insertion sort method
   	* @param array the Integer array
   	* @return String String Array value
   	*/
		
	public static String[] insertionSortString(String[] str) {
		String temp;
		for(int i = 0; i < str.length; i++)
		{
			temp = str[i];
			for( int j = i+1; j < str.length; j++) 
				
	        {
				//if condition for comparing two strings
				
	        	if(temp.compareTo(str[j]) > 0)
	        	{
	        		temp = str[j];
	        		str[j] = str[i];
	        		str[i] = temp;
	        		}
	        	
	        }
		}
		return str;
	    }
 	
//********************** Merge Sort Method **********************//

 	/**
   	* Function to Merge array elements
   	* @param array the Integer array Low value Mid value and High Value
   	* @return array
   	*/
 	
 	public static int[] merge(int[] arr, int l, int m, int r) {
 		int n1 = m-l+1;
 		int n2 = r-m;
 		int L[] = new int [n1];
 		int R[] = new int [n2];
 		
 		// Store the values in the Array
 		
 		for (int i = 0; i < n1; i++)
 		{
 			L[i] = arr[l + i];
 			}
 		
 		for(int j = 0 ; j < n2 ; j++)
 		{
 			R[j] = arr[m + 1 + j];
 			}
 		
 		int i = 0, j = 0;
 		int k = l; 
 		
 	 // Compare And Merge the two Array elements
 		
 		while (i < n1 && j < n2)
 		{ 
 			if (L[i] <= R[j])
 			{ 
 				arr[k] = L[i];
 				i++;
 				} 
 		    else
 		    { 
 		        arr[k] = R[j]; 
 		        j++; 
 		        } 
 			k++;
 			} 
 		
    // Put the remaining Elements in the Array  
 		
 		 while (i < n1) 
 		 { 
 		    arr[k] = L[i]; 
 		    i++; 
 		    k++; 
 		    }
 		 while (j < n2)
 		 {
 			 arr[k] = R[j]; 
 		     j++; 
 		     k++; 
 		     }
 		 return arr;
 		 }
 	
 /**********************************************/
 	
	public static void mSort(int[] arr, int l, int r) {
		 if (l < r)
		 { 
	   // Find the middle point 
	         int m = (l+r)/2; 
	  
	  // Sort first and second halves 
	         mSort(arr, l, m); 
	         mSort(arr , m+1, r); 
	  
	  // Merge the sorted halves 
	         merge(arr, l, m, r); 
	         } 
		  }
	
//********************** Monthly Payment **********************//

	/**
   	* Function to calculate Monthly Payment
   	* @param principal, rate 0f interest and no of years 
   	* @return payment
   	*/
		
	public static double monthlyPayment(int p, int r, int y) {
		int n = 12 * y;
		int s = r / (12 * 100);
		double d  = Math.pow((1 + r), -n);
		double payment = ((p * s) / (1 - d));
		return payment;
	}
	
//******************** Temperature Conversion ********************//
	
	/**
   	* Function to convert temperature in celcuis or kelvin depend upon choice
   	* @param temperature and String 
   	* @return calculated temperature
   	*/
	
	public static float temperaturConversion(float temp, String ch) {
		float res = 0;
		if("C".equals(ch) || "c".equals(ch)) {
			res = (temp - 32) * 5/9;
		}
		else if ("F".equals(ch) || "f".equals(ch)) {
			res = (temp * 9/5) + 32;
		}
		return res;
	}
	
//********************** Day of Week **********************//
	
	/**
   	* Function to calculate day of week
   	* @param date, month and year
   	* @return Day of week
   	*/
	
	public static int dayOfWeek(int d, int m, int y) {
		int a, b, c, x;
		c = y - (14 - m ) / 12;
		x = c + c /4 - c /100 + c /400;
		b = m + 12 * ((14 - m ) / 12) - 2;
		a = ( d + x + 31 * b / 12) % 7;
		return a;
		}
	


//********************** Square Root of Number **********************//	
	
	/**
   	* Function to Calculate square root of numberw
   	* @param number
   	* @return Equivalent Square root of number
   	*/
	
	public static int sqrt(int number) {
		int t = number;
		t = ((number/t + t)/2);
		double epsilon = 1e-15 ;
		if(Math.abs(t - number/t) > epsilon*t) {
			t = ((number/t + t)/2); 
			
		}
		return t;
	}

//************* To Calculate Percentage Of Head Tail ************//
	
	/**
	* Function to Calculate Calculate Percentage Of Head Tail
	* @param no of times coin flip
 	* @return nothing
	*/
	 
	public static void percentFlip(int n) {
		float hcount=0, tcount=0;
		int rand;
		Random ran = new Random();
			
		//for loop counting head and tail count
			
		for (int i=1; i <= n ; i++) {
			rand = ran.nextInt(2);
			if (rand == 0) {
				tcount++;
			}
			else {
				hcount++;
				}
			}
		System.out.println("Head count:"+hcount);
		System.out.println("Tail count:"+tcount);
		float resulthead = Util.percentCalculation (hcount, n);
		float resulttail = Util.percentCalculation (tcount, n);
        System.out.println("\nPercentage of Head " + resulthead);
		System.out.println("\nPercentage of Tead " + resulttail);
		}
	  

    
//******************** Distinct Coupon Number *************************//	  
	  
  	 public static int[] distinctCoupon(int number) {
  		int n =  number - 0 + 1;
  		int array [] = new int [n];
  		for(int i = 0 ; i < n; i++) {
  			array[i] = i;
  		}
  		int result[] = new int [n];
  		int random = n;
  		Random num = new Random();
  		for(int i = 0; i < n; i++) {
  			int k = num.nextInt(random);
  			result[i] = array[k];
  			array[k] = array[random-1];
  			random--;
  		}
  		return result;
  	}
  	      
//******************* To Euclidean Distance *********************//

    /**
  	* Function to Calculate Euclidean Distance
  	* @param Two Points
     	* @return Return Total Distance
     	*/
  	 
  	public static double calculateDistance(int x, int y) {
  		double d1 = Math.pow(x, 2);
  		double d2 = Math.pow(y, 2);
  		double total = Math.sqrt(d1+d2);
  		return total;
  		}
  
//******************** Gambler Win Loss ***********************//

  	/**
  	* Function to Calculate Percentage of Win and Loss 
  	* @param stake And goal and No of times to play 
   	* @return Nothing
   	*/
  		
      public static void calculatePercentWinLoss(int $stake, int $goal, int nooftimes) {
  		int cash = $stake;
  		int win = 0, loss = 0, bets = 0;
  		float losspercent = 0, winpercent = 0;
  		
  		//for loop for playing the game nooftimes
  			
  		for(int i = 0; i <= nooftimes; i++) {
  				
  			//to check cash is or reach goal
  				
  			while(cash > 0 && cash < $goal) {
  				if(Math.random() < 0.5) {
  					cash++;
  					bets++;
  					win++;
  				}
  				else {
  					cash--;
  					bets++;
  					loss++;
  				}
  			}
  		}
  		System.out.println("\nNO of Times He/She Bets in Total Play:" +bets);
  		System.out.println("\nNo of Times He/She Wins in Total Play:" +win);
  		losspercent = Util.percentCalculation(loss, bets);
  		System.out.println("\nPercentage of win :"+winpercent);
  		System.out.println("\nPercentage of Loss :"+losspercent);
  	}	
  	    
    
//**************** To Calculate Harmonic Number *****************//

	/**
   	* Function to Calculate Harmonic value 
   	* @param Number
   	* @return Harmonic value
   	*/
		
	public static float calculateHarmonic(int n) {
		float temp = 0, i = 1;
			
		// while loop for calculating Harmonic value till n
			
		while (i <= n) {
			temp = temp + (float)(1/i);
			System.out.println(temp);
			i++;
			}
		return temp;
		}
	
//************************ Leap year ***************************//	
	
	/**
	* Function to determine leap year or not
	* @param integer number
 	* @return nothing
 	*/
		
	public static boolean isLeapYear(int year) {
			
		// if condition to check leap year
			
		if (year%400 == 0 || year%4 == 0 && year%100 != 0) {
				return true;
			}
			else {
				return false;
			}
		}
/************ To Calculate Digit Count **************/
	
	public static int digitCount(int year) {
		int count = 0;
			
		//while Loop to count the Digits in number
			
		while (year != 0) 
		{
			year = year/10;
			count++;
			}
		return count;
		}	

//**************** To Calculate sum Of Triplets *****************//

	/**
    * Function to Calculate Sum of Triplets 
	* @param array and no of array elements
 	* @return count
   	*/
			
	public static int sumOfTriplets(int arr[], int n) {
		int count = 0, total;
		for(int i = 0 ; i < n-2 ; i++) {
			for(int j = i+1 ; j < n-1 ; j++) {
				for(int k = j+i+1 ; k < n ; k++) {
					if(arr[i] + arr[j]+ arr[k] == 0) {
						total = arr[i] + arr[j] + arr[k];
						System.out.println("Distinct Triplets");
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k]+"="+total);
						count++;
					}
					else {
						count++;
					}
				}
			}
		}
		return count;
	}
	
//******************* To Calculate Power of 2 *********************//

	/**
 	* Function to Calculate Power of 2 
 	* @param number
  	* @return Nothing
  	*/
		
	public static void powerOfTwo(int n) {
		int i=31,j=0;
		int temp = 1;
		
		//if condition to check is number is less than 31 
		
		if (n < i) {
			System.out.println("Power Table of 2");
			while (j <= n) {
				System.out.println("2^"+j+"=" +temp);
				temp = temp*2;
				j++;
				}
			}
		}
	
//******************** Quadratic Equation Roots ***********************//

	/**
	* Function to Calculate roots 
  	* @param three parameters as number
   	* @return nothing
  	*/
		
	public static void calculateRoots(int a, int b, int c) {
		//	double d1 = Math.pow(b, 2);
		double d = b*b - 4*a*c;
		double sq = Math.sqrt(d);
		double root1 = (-b + sq)/(2*a);
		double root2 = (-b - sq)/(2*a);
		System.out.println("First Root of X: "+root1);
		System.out.println("Second Root of X: "+root2);
		}
	
//******************** Stop watch Elapsed Time ********************//	
	
	/**
	* Function to Calculate Elapsed time between start and stop of watch 
 	* @param Nothing
   	* @return elapsed Time
   	*/	
	
	//Take a variable to store the time
	static long startTimer=0;
	static long stopTimer=0;
	static long elapsed;

		//to start timer
	public static void start() {
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
		}
		// to stop timer
	public static void stop() {
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
		}
	public static long getElapsedTime() {
		elapsed=stopTimer-startTimer;
		return elapsed;
		}
	
//******************** String Permutations ********************//
	
	public static void permutations(char ch[], int currentIndex)
	{
		if(currentIndex==ch.length-1)
			System.out.println(String.valueOf(ch));
		for(int i=currentIndex;i<ch.length;i++)
		{
			swap(ch,currentIndex,i);
			permutations(ch,currentIndex + 1);
			swap(ch,currentIndex,i);
		}
	}
	
/***********************************************************/	
	
	public static void swap(char[] ch, int i, int j)
	{
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	
//******************** To Print Two D Array **********************//	
		/**
	   	* Function to print Two dimensional array 
	   	* @param array with row and column count
	   	* @return nothing
	   	*/
		
	public static void print2DArray(int[][] arr, int row, int column) {
			
		// for loop to iterate array
			
		for(int i =0; i < row; i++) {
			System.out.println();
			for(int j = 0; j < column; j++) {
				System.out.print(arr[i][j] +" ");
			}
		}
	}
	
//****************** To Calculate Wind Chill ********************//
	
	/**
	* Function to Calculate wind chill
	* @param temperature and wind speed
  	* @return nothing
   	*/
			
	public static void calculateWindChill(double t, double v) {
		double r = Math.pow(v, 0.16);
		double total = 35.74 + 0.6215*t + (042725*t + 0.3575) + r;
		System.out.println("\nThe Wind Chill is "+total);
		}
}
