package com.concordia.dsAndCollections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Monkey");
		animals.add("Tiger");

//		System.out.println("Size: " + animals.size());
		
//		animals.remove(0);
//		animals.remove("Cat");
		
		if (animals.contains("Cat")) {
			animals.remove("Cat");
		} else {
			animals.add("Lion");
		}

		if (animals.isEmpty()) {
			System.out.println("No animals founds");
		} else {
			for (String animal : animals) {
				System.out.println(animal);
			}
		}
		
		animals.add(0, "Cow");
	}

}
