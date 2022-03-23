package com.teeta90array.Shape.Quadrilaterals;

import com.teeta90array.Shape.planeShape;

public class Quadrilaterals extends planeShape{
	private static int count = 0;
	private double length, breadth;

	//	empty constructor
	public Quadrilaterals() {
	}	
	
	//	constructor for length and breadth
	public Quadrilaterals(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	//	implementation of abstract method to find perimeter of a shape
	@Override
	public void getPerimeter() {

	}

	//	implementation of abstract method to find area of a shape
	@Override
	public void getArea() {

	}
	
}
