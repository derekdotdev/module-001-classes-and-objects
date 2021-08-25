package com.javaforbeginners.classes.and.objects;

public class PlayWithClasses {

	public static void main(String[] args) {
		// int month, day, year;
		// int annivarsaryDay, anniversaryMonth

		Date birthday = new Date(6, 26, 1987);
		// Date anniversary = new Date(7, 19, 2018);

		// calling object calls and returns toString() method (so either strat works)
		System.out.println("Your birthday is: " + birthday);
		System.out.println("Your birthday is: " + birthday.toString());

		/*
		 * birthday.setMonth(6); birthday.setDay(26); birthday.setYear(1987);
		 */

		// Aircraft cessna172 = new Aircraft();

		// Aircraft piperSaratoga = new Aircraft();

	}

}

class Aircraft {
	int passengers; // number of people
	int cruiseSpeed; // miles per hour
	double fuelCapacity; // gallons
	double fuelBurnRate; // gallons per hour
}
