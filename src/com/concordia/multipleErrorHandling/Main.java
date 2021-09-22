package com.concordia.multipleErrorHandling;

public class Main {

	public static void main(String[] args) {

		int numbers[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denominators[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i] + "/" + denominators[i] + " is " + numbers[i] / denominators[i]);
			} catch (ArithmeticException e) {
				System.out.println("Can't divide by zero");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("No matching element found: " + e.getMessage());
			} finally {
				System.out.println("Running");
			}
		}
	}

}
