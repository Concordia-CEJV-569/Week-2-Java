package com.concordia.errorHandling;

public class Main {

	public static void main(String[] args) {

//		String[] countries = {"Canada", "USA", "Mexico"};
//		
//		System.out.println(countries[3]);

		float sum = 0;

		for (String argument : args) {
			try {
				sum = sum + Float.parseFloat(argument);
			} catch (NumberFormatException e) {
//				System.out.println("Exception message" + e.getMessage());
				System.out.println(argument + " is not a number.");
			}
		}

		System.out.println("Sum is: " + sum);
	}

}
