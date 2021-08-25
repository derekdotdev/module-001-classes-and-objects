package com.javaforbeginners.classes.and.objects;

//import java.lang.Math.*; may be required for Math.PI constant
//it seems to have disappeared after entry on my end

public class Circle2 {

	// declare field(s)
	private double radius;

	// generate getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// overloaded 0-arg constructor that sets field value to 0
	Circle2() {
		this(0);
	}

	// create constructor with radius parameter
	Circle2(double radius) {
		this.radius = radius;
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
