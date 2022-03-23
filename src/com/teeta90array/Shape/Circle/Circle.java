package com.teeta90array.Shape.Circle;
//  Circle class

import com.teeta90array.Shape.planeShape;

public class Circle extends planeShape {
    private double radius;
    private double diameter;
    private static final double PIE = 3.142;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getPerimeter() {
        // method to get the perimter of a circle
        System.out.println("The circle's perimeter of radius: "+this.radius+ " = "+2*PIE*radius);	
    }

    @Override
    public void getArea() {
        // method to get the area of a circle
        if(getRadius()>0.0){
            System.out.println("The circle's area of radius: "+this.radius+ " = "+PIE*radius*radius);
    
        }
    }


}
