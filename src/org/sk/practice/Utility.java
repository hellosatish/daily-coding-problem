package org.sk.practice;

import java.util.Scanner;
/**
 *
 *Simple utility methods.</br> 
 *<strong> Please note these are not production grade methods and might fail.</strong>
 *
 *</br>
 *@author Satish Sharma
 */
public class Utility {
	/**
	 * Print data 
	 * @param data
	 */
	public static void print(Object data) {
		System.out.println(data);
	}
	
	/**
	 * Messy code to
	 * Prompt user for length of the array, read that number of elements and return the array
	 * 
	 * @return int[]
	 */
	public static int[] readIntArrayFromConsole() {
		Scanner reader = getConsoleReader();
	System.out.println("What is the length Of array ? ");	
    int length =	reader.nextInt();
		int [] array = new int[length];
		
		for(int i=0 ; i<length ; i++) {
			int data = reader.nextInt();
			array[i] = data;
		}
		return array;
	}
	
	//intentionally not doing exception handling
	private static final Scanner getConsoleReader() {
		return new Scanner(System.in);
		 
//		return new Scanner((System.console()).reader());
	}
	
}
