package com.teeta90array.Shape.Triangle;

import com.teeta90array.Shape.Quadrilaterals.Quadrilaterals;

public class Triangle extends Quadrilaterals{
    private double side1;
    private double side2;
    private double side3;
        
	public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }    
  
   	//	A method to find perimeter of a triangle
	public void getPerimeter() {
		System.out.println("The perimeter of a triangle("+this.side1+" ,"+this.side2+" ,"+this.side3+")"
                                    + " = " +(this.side1+this.side2+this.side3));	
	}

	//	A method to find area of a triangle
	public void getArea() {
		System.out.println("The area of a triangle("+this.side1+" ,"+this.side2+" ,"+this.side3+")"
                                    + " = " +(this.side1*this.side2*this.side3));	
	}
}
