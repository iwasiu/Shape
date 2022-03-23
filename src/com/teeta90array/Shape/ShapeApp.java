package com.teeta90array.Shape;

import com.teeta90array.Shape.Circle.Circle;
import com.teeta90array.Shape.Quadrilaterals.Quadrilaterals;

public class ShapeApp {

	public static void main(String[] args) {
		// create object of square
		Quadrilaterals q1 = new Quadrilaterals(2.0, 2.0);
		Quadrilaterals q2 = new Quadrilaterals(3.0, 4.0);
		Quadrilaterals q3 = new Quadrilaterals(5.0, 2.0);

		Circle c1 = new Circle(7);

		System.out.println("-------square---------");
		q1.getArea();
		q1.getPerimeter();
		System.out.println("-------rectangle---------");
		q2.getArea();
		q2.getPerimeter();
		System.out.println("--------trapezium--------");
		q3.getArea();
		// q3.getPerimeter();
		System.out.println("--------circle--------");
		c1.getArea();

		// create an on
	}
}
