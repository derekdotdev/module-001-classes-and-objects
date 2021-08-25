package com.javaforbeginners.classes.and.objects;

public class Date {

	private int month; // instance variables
	private int day; // make private
	private int year; // then create Methods() for them

	// Constructor Method is the only method that starts with capital letter
	// and has no return type
	public Date(int m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
	}

	public int getMonth() { // Accessor (Getter)
		return month;
	}

	public void setMonth(int m) { // Mutator (Setter)
		if (m >= 1 && m <= 12) {
			this.month = m;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int d) {
		if (d >= 1 && d <= 31) {
			this.day = d;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		if (y >= 0 && y <= 5000) {
			this.year = y;
		}
	}

	@Override
	// standard way of turning an object into a string
	public String toString() {
		String result;
		result = month + "/" + day + "/" + year;
		return result;
	}
}
