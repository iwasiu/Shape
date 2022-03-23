package com.teeta90array.Shape.Rectangle;

public class Rectangle {
    private double length, breadth;

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
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
        //	A method to find perimeter of a square
	public void getPerimeter() {
		System.out.println("The perimeter of a rectangle(: "+this.length+" ,"+this.breadth+")"
                                    + " = " + perimeter());
	}

    private double perimeter() {
       return 2 * (this.length+this.breadth);
    }

	//	A method to find area of a square
	public void getArea() {
		System.out.println("The area of a rectangle(: "+this.length+" ,"+this.breadth+")"
                                    + " = " +(area()));	
	}

    private double area() {
        return this.length * this.breadth;
    }
}
