package com.concordia.composition;

public class Engine {
	private int numberOfCylinders;
	private Oil oil;

	public Engine(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
		oil = new Oil();
		oil.setColor("Blue");
		oil.setCapacity(10);
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public Oil getOil() {
		return oil;
	}

	public void setOil(Oil oil) {
		this.oil = oil;
	}
	
	public String getOilColor() {
		return this.oil.getColor();
	}

}
