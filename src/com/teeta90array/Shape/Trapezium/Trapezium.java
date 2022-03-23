package com.teeta90array.Shape.Trapezium;

import com.teeta90array.Shape.Quadrilaterals.Quadrilaterals;

public class Trapezium extends Quadrilaterals{
    private double shortBaseLength;
    private double longBaseLength;
    private double verticalheight;
    private double side1, side2, side3, side4;
    
    private Trapezium() {
    }

    public Trapezium(double shortBaseLength, double longBaseLength, double verticalheight) {
        this.shortBaseLength = shortBaseLength;
        this.longBaseLength = longBaseLength;
        this.verticalheight = verticalheight;
    }

    public Trapezium(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public double getShortBaseLength() {
        return shortBaseLength;
    }

    public void setShortBaseLength(double shortBaseLength) {
        this.shortBaseLength = shortBaseLength;
    }

    public double getLongBaseLength() {
        return longBaseLength;
    }

    public void setLongBaseLength(double longBaseLength) {
        this.longBaseLength = longBaseLength;
    }

    public double getVerticalheight() {
        return verticalheight;
    }

    public void setVerticalheight(double verticalheight) {
        this.verticalheight = verticalheight;
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

    public double getSide4() {
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    //	A method to find perimeter of a square
	public void getPerimeter() {
        if(this.side1==0.0 || this.side2==0.0 || this.side3==0.0 || this.side4==0.0){
            System.out.println("incomplete variable to find trapezium's perimeter");
        }else{
        System.out.println("The perimeter of a trapezium("+this.side1+" ,"+this.side2+" ,"+this.side3+" ,"+this.side4+")"
                                    + " = " + perimeter());
        }
	}

    private double perimeter() {
       return 2 * (this.side1+this.side2+this.side3+this.side4);
    }

	//	A method to find area of a square
	public void getArea() {
        if(this.shortBaseLength==0.0 || this.longBaseLength==0.0 || this.verticalheight==0.0){
            System.out.println("wrong argument variables to find trapezium's area");
        }else{
		    System.out.println("The area of a trapezium("+this.shortBaseLength+" ,"+this.longBaseLength+", "+this.verticalheight+")"
                                    + " = " +(area()));	
        }
	}

    private double area() {
        return (this.shortBaseLength + this.longBaseLength)/2 * this.verticalheight;
    }
}
