package com.teeta90array.Shape;

public abstract class planeShape {
	
	//	get total count of plane shape created
	private static int count = 0;
	
	//	attributes for shape
	protected double radius, diameter,arclength,length, breadth, height, base;
	
	//	getter and setter methods
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getArclength() {
		return arclength;
	}

	public void setArclength(double arclength) {
		this.arclength = arclength;
	}

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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	//	a method to find perimeter of a shape
	public abstract void getPerimeter();

	//	a method to find area of a shape
	public abstract void getArea();
	
}
