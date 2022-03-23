package com.teeta90array.Shape;

import com.teeta90array.Shape.Circle.Circle;
import com.teeta90array.Shape.Quadrilaterals.Quadrilaterals;
import com.teeta90array.Shape.Rectangle.Rectangle;
import com.teeta90array.Shape.Square.Square;
import com.teeta90array.Shape.Trapezium.Trapezium;
import com.teeta90array.Shape.Triangle.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		// create object of square
		Quadrilaterals q1 = new Square(2.0);
		Quadrilaterals q2 = new Rectangle(3.0, 4.0);
		Quadrilaterals q3 = new Triangle(2.0,3.0,4.0);
		Quadrilaterals q4 = new Trapezium(2.0,3.0,4.0);
		Quadrilaterals q5 = new Trapezium(2.0,3.0,4.0,1.0);
		Circle c1 = new Circle(7);

		System.out.println("-------square---------");
		q1.getArea();
		q1.getPerimeter();
		System.out.println("-------rectangle---------");
		q2.getArea();
		q2.getPerimeter();
		System.out.println("--------triangle--------");
		q3.getArea();
		q3.getPerimeter();
		System.out.println("--------trapezium--------");
		q4.getArea();
		q4.getPerimeter();
		System.out.println("------");
		q5.getArea();
		q5.getPerimeter();
		System.out.println("--------circle--------");
		c1.getArea();
		// c1.getPerimeter();
		// create an on
	}
}
