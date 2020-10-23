package org.sk.practice;

import java.util.Arrays;

/**
 * 
 * @author Satish Sharma
 *
 *         Given an array of integers, return a new array such that each element
 *         at index i of the new array is the product of all the numbers in the
 *         original array except the one at i.
 * 
 *         For example, if our input was [1, 2, 3, 4, 5], the expected output
 *         would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the
 *         expected output would be [2, 3, 6].
 * 
 */
public class ElementsMultiplication {

	public static void main(String[] args) {
		int[] inputData = Utility.readIntArrayFromConsole();
		int[] outputArray = new int[inputData.length];

		for (int i = 0; i < inputData.length; i++) {
			int data = 1;
			for (int j = 0; j < inputData.length; j++) {
				if (i != j) {
					data = data * inputData[j];
				}
			}
			outputArray[i] = data;
		}

		Utility.print(Arrays.toString(outputArray));

	}
}
