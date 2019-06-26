/*********************************************************************
* Compilation: javac -d bin CouponNumber.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.CouponNumber
*
* Purpose: Generate Distinct Coupon Number.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class CouponNumber {
	public static void main (String []args) {
		System.out.println("*** Program to Generate Distinct Coupon Number ***");
		System.out.println("\nEnter Number Of Coupon to be required to Generate:");
		int number = Util.getInputInteger();
		int [] array = Util.distinctCoupon(number);
		for(int i = 0 ; i < number; i++) {
			System.out.print("\n"+ array[i]);
		}
	}
}
