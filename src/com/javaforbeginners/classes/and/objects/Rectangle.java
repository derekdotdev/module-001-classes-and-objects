package com.javaforbeginners.classes.and.objects;

public class Rectangle {

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

	// Constructor that accepts length and with as parameters
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// overloaded 0-arg constructor that sets field values to 0
	Rectangle() {
		this.length = 0;
		this.width = 0;
	}

	// declare method with no parameters which returns the area
	public double computeArea() {
		double area = length * width;
		return area;

	}

	// generic toString() method
	@Override
	public String toString() {
		String result;
		result = "length is: " + length + ", width is: " + width;
		return result;
	}

}
