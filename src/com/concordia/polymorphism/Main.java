package com.concordia.polymorphism;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();

//		dog.makeSound();
//		dog.makeSound("Woof");
//		dog.makeSound("Woof", "very loud!");
//		dog.move();
//		dog.makeSound();
//		dog.makeSound("another Woof!");

		Vet vet = new Vet();
		Cat cat = new Cat();

		vet.giveShot(cat);
	}
	
}
