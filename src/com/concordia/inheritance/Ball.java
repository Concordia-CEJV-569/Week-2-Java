package com.concordia.inheritance;

public class Ball {
	private String company;
	private String color;
	private int capacity;
	private int bounceRate;

	public Ball() {
	}

	public Ball(String company, String color, int capacity, int bounceRate) {
		super();
		this.company = company;
		this.color = color;
		this.capacity = capacity;
		this.bounceRate = bounceRate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBounceRate() {
		return bounceRate;
	}

	public void setBounceRate(int bounceRate) {
		this.bounceRate = bounceRate;
	}

	public void showColor() {
		System.out.println(color);
	}

	public void showType() {
		System.out.println(company);
	}

	public void bounce() {
		System.out.println("Bouncing...");
	}

	public void deflate() {
		System.out.println("Deflating...");
	}

	public void inflate() {
		System.out.println("Infalting...");
	}

	@Override
	public String toString() {
		return "Ball [company=" + company + ", color=" + color + ", capacity=" + capacity + ", bounceRate=" + bounceRate
				+ "]";
	}
}
