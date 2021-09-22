package com.concordia.polymorphism;

public class Animal {
	public String name;
	
	public void makeSound() {
		System.out.println("grrr");
	}
	
	public void makeSound(String sound) {
		System.out.println(sound);	
	}
	
	public void makeSound(String sound, String loundness) {
		System.out.println(sound + ", loudness: " + loundness);	
	}
}
