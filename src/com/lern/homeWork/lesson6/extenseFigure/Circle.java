package com.lern.homeWork.lesson6.extenseFigure;

public class Circle extends Figure {

    public Circle(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    public double diameter() {
        return Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX());
    }

    public double radius() {
        return (Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX())) / 2;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(radius(), 2));
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString();
    }
}
