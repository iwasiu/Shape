package com.teeta90array.Shape.Quadrilaterals;

import com.teeta90array.Shape.planeShape;

public class Quadrilaterals extends planeShape{
	private static int count = 0;
	private double length, breadth;

	//	empty constructor
	public Quadrilaterals() {
	}	
	
	//	constructor for length and breadth(square and rectangle)
	public Quadrilaterals(double length, double breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
	}

	//	implementation of abstract method to find perimeter of a shape
	@Override
	public void getPerimeter() {
		double perimter = getParticularPerimeter();
		System.out.println("The perimeter of "+getShapeName()+" of length: "+this.length+ " and breadth: "+this.breadth+" = "+perimter);	
	}

	//	implementation of abstract method to find area of a shape
	@Override
	public void getArea() {
		double area = getParticularArea();
		System.out.println("The area of "+getShapeName()+" of length: "+this.length+ " and breadth: "+this.breadth+" = "+area);	
	}

	private double getParticularPerimeter() {
		double name = 0;
		if(isSquare()){
			name = 2 *(getLength() + getBreadth());
		}else if(isRectangle()){
			name = 2 *(getLength() + getBreadth());
		}else if(isTrapezium()){
			name = 11111111.0;
		}

		return name;
	}

	private double getParticularArea() {
		double name = 0;
		if(isSquare()){
			name = getLength() * getBreadth();
		}else if(isRectangle()){
			name = getLength() * getBreadth();
		}else if(isTrapezium()){
			name = (getParallelSide1()+getParallelSide2())/2 * getVerticalHeight();
		}

		return name;
	}

	//	method to get particular quadrilateral name 	
	private String getShapeName() {
		String nameForShape = "";
		if(isSquare()){
			nameForShape =  "square";
		}else if(isRectangle()){
			nameForShape = "rectangle";
		}else if(isTrapezium()){
			nameForShape = "trapezium";
		// }else if(isRectangle){
		// 	nameForShape = "rectangle";
		// }else if(isRectangle){
		// 	nameForShape = "rectangle";
		}
		return nameForShape ;
	}


	//	check 
	private boolean isSquare = isSquare();
	private boolean isRectangle = isRectangle();
	private boolean isTrapezium = isTrapezium();
	// private boolean isParallelogram = isParallelogram();
	// private boolean isRhombus = isRhombus();
	// private boolean isKite = isKite();

	private boolean isSquare() {
		// check for same length
		return getLength() == getBreadth();
	}

	private boolean isRectangle() {
		// check for unequal length
		return getLength() != getBreadth();
	}

	private boolean isTrapezium() {
		// check for if all sides are non-zero
		return (getParallelSide1()>0.0 && getParallelSide2()>0.0 && getVerticalHeight()>0.0);
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
}
