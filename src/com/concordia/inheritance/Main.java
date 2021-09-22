package com.concordia.inheritance;

public class Main {

	public static void main(String[] args) {
		Basketball basketball = new Basketball();
		Football football = new Football();

		basketball.setColor("blue");
		basketball.setCompany("Nike");
		basketball.bounce();

		football.setColor("white");
		football.setCompany("Puma");
		football.setIsFifa(true);
		football.bounce();
		System.out.println(football.getIsFifa());

//		System.out.println(basketball);
//		System.out.println(football);
	}

}
