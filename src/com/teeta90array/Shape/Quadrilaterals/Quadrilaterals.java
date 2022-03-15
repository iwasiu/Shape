package com.teeta90array.Shape.Quadrilaterals;

import com.teeta90array.Shape.planeShape;

public class Quadrilaterals extends planeShape{
	private double length, breadth;
	

public Quadrilaterals(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

//	implementation of abstract method to find perimeter of a shape
	public void getPerimeter() {
	System.out.println("perimeter method");	
	}

//	implementation of abstract method to find area of a shape
	public void getArea() {
		System.out.println("area method");	
	}
}
