package com.lern.homeWork.lesson6.extenseFigure;

public class Rectangle extends Figure implements Diagonal{

    public Rectangle(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    @Override
    public double diagonal () {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString();
    }
}
