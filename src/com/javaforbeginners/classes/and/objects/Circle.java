package com.javaforbeginners.classes.and.objects;

//import java.lang.Math.*; may be required for Math.PI constant
//it seems to have disappeared after entry on my end

public class Circle {

	// declare field(s)
	private double radius;

	// generate getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// create constructor with radius parameter
	Circle(double radius) {
		this.radius = radius;
	}

	// overloaded 0-arg constructor that sets field values to 0
	Circle() {
		this.radius = 0;
	}

	// declare method with no parameters which returns the area
	public double computeArea() {
		double area = Math.PI * (radius * radius);

		return area;
	}

	/*
	 * public String toString() { return null;
	 * 
	 * }
	 */

}
