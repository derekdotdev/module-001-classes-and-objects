package com.javaforbeginners.classes.and.objects;

public class GeometryRunner2 {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle(4, 5);
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setLength(5.7);
		rectangle2.setWidth(8.1);

		System.out.printf("Rectangle with sides %.2f and %.2f has area %.2f.\n", rectangle1.getLength(),
				rectangle1.getWidth(), rectangle1.computeArea());
		System.out.printf("Rectangle with sides %.2f and %.2f has area %.2f.\n", rectangle2.getLength(),
				rectangle2.getWidth(),
				rectangle2.computeArea());

		System.out.println(rectangle1);

		Circle circle1 = new Circle(3.2);
		Circle circle2 = new Circle();
		circle2.setRadius(4);
		System.out.printf("The area of circle with radius %.2f has area %.14f.\n", circle1.getRadius(),
				circle1.computeArea());
		System.out.printf("The area of circle with radius %.2f has area %.14f.\n", circle2.getRadius(),
				circle2.computeArea());

	}

}
