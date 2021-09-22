package com.concordia.inheritance;

public class Football extends Ball {
	public boolean isFifa;

	public boolean getIsFifa() {
		return isFifa;
	}

	public void setIsFifa(boolean isFifa) {
		this.isFifa = isFifa;
	}

	// Override
	public void bounce() {
		System.out.println("Football Bouncing...");
	}
}
