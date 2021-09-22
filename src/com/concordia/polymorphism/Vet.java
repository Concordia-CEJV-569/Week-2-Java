package com.concordia.polymorphism;

public class Vet {
	// Polymorphic argument =>
	public void giveShot(Animal animal) {
		animal.makeSound();
	}
}
