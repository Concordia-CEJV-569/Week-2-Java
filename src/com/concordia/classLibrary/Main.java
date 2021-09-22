package com.concordia.classLibrary;

public class Main {

	public static void main(String[] args) {

		// StringBuilder class =>
//		StringBuilder stringBuilder = new StringBuilder();
//
//		stringBuilder.append("Hello");
//		stringBuilder.append("World");
//		stringBuilder.append('C');
//		stringBuilder.delete(1, 3);

//		System.out.println(stringBuilder + " length: " + stringBuilder.capacity());

		Person person1 = new Person();
		System.out.println(person1.getClass().getSimpleName());
		System.out.println("Hashcode: " + person1.hashCode());

		Person person2 = new Person();

		if (person1.equals(person2)) {
			System.out.println("Same objects");
		} else {
			System.out.println("Different objects");
		}
	}

}
