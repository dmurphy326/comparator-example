package com.dmurphy;

public class Diamond {
	private Clarity clarity;
	private char color;
	private double carat;
	
	public Diamond(Clarity clarity, char color, double carat) {
		this.clarity = clarity;
		this.color = color;
		this.carat = carat;
	}

	public Clarity getClarity() {
		return clarity;
	}

	public char getColor() {
		return color;
	}

	public double getCarat() {
		return carat;
	}
}
