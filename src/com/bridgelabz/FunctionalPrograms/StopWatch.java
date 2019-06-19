/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines elapsed time between start and stop of stop watch.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class StopWatch {
	
	/*
	* The main function is written to test Stop Watch class
	*/
	
	public static void main (String args[]) {
		long elapsedtime;
		System.out.println("*** Program To calculate Elapsed Time Between Start And Stop of Stopwatch ***");
		System.out.println("\nEnter Any No to Start the Stopwatch:");
		Util.getInputInteger();
		Util.start();
		System.out.println("\nEnter Any No to Stop the Stopwatch:");
		Util.getInputInteger();
		Util.stop();
		elapsedtime = Util.getElapsedTime();
		System.out.print("\nElapsed  Time in Mili Seconds: "+elapsedtime+ " MiliSeconds");
		System.out.print("\nElapsed  Time in Seconds: "+elapsedtime/1000+ " Seconds");
	}

}
