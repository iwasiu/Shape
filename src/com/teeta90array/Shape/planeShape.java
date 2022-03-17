package com.teeta90array.Shape;

public abstract class planeShape {
	
	//	get total count of plane shape created
	private static int count = 0;
	
	//	attributes for shape
	protected double length, breadth;
	
	//	getter and setter methods
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	//	a method to find perimeter of a shape
	public abstract void getPerimeter();

	//	a method to find area of a shape
	public abstract void getArea();
}
