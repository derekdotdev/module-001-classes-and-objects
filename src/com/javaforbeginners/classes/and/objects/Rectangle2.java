package com.javaforbeginners.classes.and.objects;

public class Rectangle2 {

	// declare private fields
	private double length;
	private double width;

	// generate getters and setters for length + width
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// overloaded 0-arg constructor that sets field values to 0
	Rectangle2() {
		this(0, 0); // (length, width)
	}

	// Constructor that accepts length and with as parameters
	Rectangle2(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// declare method with no parameters which returns the area
	public double computeArea() {
		double area = length * width;
		return area;
		// return length * width; would also work.
	}

	// generic toString() method
	@Override
	public String toString() {
		String result;
		result = "Length is: " + length + ", width is: " + width;
		return result;
	}

}
