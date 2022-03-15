package com.teeta90array.Shape.Quadrilaterals;

import com.teeta90array.Shape.planeShape;

public class Quadrilaterals extends planeShape{
	private static int count = 0;
	private double length, breadth;
	
//	constructor
public Quadrilaterals(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

//	getters and setters methods
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

	//	implementation of abstract method to find perimeter of a shape
	public void getPerimeter() {
		System.out.print("The perimeter this quadrilateral of length :"+this.length+ " and "+this.length+" = "+2 * (this.length + this.breadth));	
	}

//	implementation of abstract method to find area of a shape
	public void getArea() {
		System.out.print("The area this quadrilateral of length :"+this.length+ " and "+this.length+" = "+(this.length * this.breadth));	
	}
	
//	check 
	private boolean isSquare = isSquare();
	private boolean isRectangle = isRectangle();
	private boolean isTrapezium = isTrapezium();
	private boolean isParallelogram = isParallelogram();
	private boolean isRhombus = isRhombus();
	private boolean isKite = isKite();

	private boolean isSquare() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isKite() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isRhombus() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isParallelogram() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isTrapezium() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isRectangle() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
