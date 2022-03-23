package com.teeta90array.Shape.Square;

import com.teeta90array.Shape.Quadrilaterals.Quadrilaterals;

public class Square extends Quadrilaterals {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public Square() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //	A method to find perimeter of a square
	public void getPerimeter() {
		System.out.println("The perimeter of a square("+this.length+")"
                                    + " = " + perimeter());	
	}

    private double perimeter() {
        return (4 * this.length);
    }

	//	A method to find area of a square
	public void getArea() {
		System.out.println("The area of a square("+this.length+")"
                                    + " = " + area());	
	}

    private double area() {
        return this.length * this.length;
    }


}
