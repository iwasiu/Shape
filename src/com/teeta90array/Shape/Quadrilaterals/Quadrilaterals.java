package com.teeta90array.Shape.Quadrilaterals;

import com.teeta90array.Shape.planeShape;

public class Quadrilaterals extends planeShape{
	private static int count = 0;
	private double length, breadth, parallelSide1, parallelSide2, vertical_Height, base_Length;

	//	constructor for length and breadth(square and rectangle)
	public Quadrilaterals(double length, double breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
	}

	//constructor for parallelSide1,parallelSide2 and verticalHeight(trapezium)
	public Quadrilaterals(double parallelSide1, double parallelSide2, double verticalHeight) {
		super();
		this.parallelSide1 = parallelSide1;
		this.parallelSide2 = parallelSide2;
		this.vertical_Height = verticalHeight;
	}

	//constructor for baseLength and verticalHeight(parallelogram)
	public Quadrilaterals(double baseLength, long verticalHeight) {
		super();
		this.base_Length = baseLength;
		this.vertical_Height = verticalHeight;
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

	public double getParallelSide1() {
		return parallelSide1;
	}

	public void setParallelSide1(double parallelSide1) {
		this.parallelSide1 = parallelSide1;
	}

	public double getParallelSide2() {
		return parallelSide2;
	}

	public void setParallelSide2(double parallelSide2) {
		this.parallelSide2 = parallelSide2;
	}

	public double getVerticalHeight() {
		return vertical_Height;
	}

	public void setVerticalHeight(double verticalHeight) {
		this.vertical_Height = verticalHeight;
	}

	//	implementation of abstract method to find perimeter of a shape
	public void getPerimeter() {
		System.out.println("The perimeter this quadrilateral of length: "+this.length+ " and breadth: "+this.breadth+" = "+2 * (this.length + this.breadth));	
	}

//	implementation of abstract method to find area of a shape
	public void getArea() {
		System.out.println("The area of "+getShapeName()+" of length: "+this.length+ " and breadth: "+this.breadth+" = "+(this.length * this.breadth));	
	}
	
	private String getShapeName() {
		String name ="";
		if(isSquare()){
			name =  "square";
		}
		return name;
	}
	//	check 
	private boolean isSquare = isSquare();
	// private boolean isRectangle = isRectangle();
	// private boolean isTrapezium = isTrapezium();
	// private boolean isParallelogram = isParallelogram();
	// private boolean isRhombus = isRhombus();
	// private boolean isKite = isKite();

	private boolean isSquare() {
		// check for same length
		return getLength() == getBreadth();
	}

	// private boolean isKite() {
	// 	// 
	// 	return false;
	// }

	// private boolean isRhombus() {
	// 	// TODO Auto-generated method stub
	// 	return false;
	// }

	// private boolean isParallelogram() {
	// 	// TODO Auto-generated method stub
	// 	return false;
	// }

	// private boolean isTrapezium() {
	// 	// TODO Auto-generated method stub
	// 	return false;
	// }

	// private boolean isRectangle() {
	// 	// TODO Auto-generated method stub
	// 	return false;
	// }
	
	
	
}
