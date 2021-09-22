package com.concordia.dsAndCollections;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		int[] integerArray = { 2, 4, 5, 8 };
		String[] stringsArray = { "Canada", "USA", "Mexico" };

		// System.out.println(integerArray[3]);
		// System.out.println(integerArray.length);

		for (int i = 0; i < integerArray.length; i++) {
			System.out.println("Item #" + i + " is: " + integerArray[i]);
		}
		
		for (int i = 0; i < stringsArray.length; i++) {
			System.out.println("Item #" + i + " is: " + stringsArray[i]);
		}
		
		// Arrays Part 2
		int[] newIntArray = new int[5];
		String[] newStringArray = new String[5];
		
		newIntArray[0] = 3;
		newIntArray[1] = 4;
		newIntArray[2] = 5;
		newIntArray[3] = 6;
		newIntArray[4] = 7;
		// newIntArray[5] = 8;
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println("Item #" + i + " is: " + newIntArray[i]);
		}
	}

}
