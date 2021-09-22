package com.concordia.composition;

public class Main {

	public static void main(String[] args) {
		Engine engine = new Engine(10);
		
		System.out.println(engine.getNumberOfCylinders());
		System.out.println(engine.getOil().getColor());
	}

}
