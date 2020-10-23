package org.sk.practice;

/**
 * 
 * @author Satish Sharma
 *
 *         Given a list of numbers and a number k, return whether any two
 *         numbers from the list add up to k. For example, given [10, 15, 3, 7, 2]
 *         and k of 17, return true since (10 + 7) and (15+2) is 17.
 *
 */
public class ArraySumOfElements {
	public static void main(String[] args) {
		int[] data = new int[] { 10, 15, 3, 7, 2 };
		int target = 17;
		for (int i = 0; i < data.length; i++) {
			for (int j = i; j < data.length; j++) {
				if (data[i] + data[j] == target) {
					System.out.println("Element : " + data[i] + " + " + data[j] + " = " + target);
				}
			}
		}
	}
}