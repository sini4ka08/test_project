package com.lern.homeWork.lesson6.extenseFigure;

public class RightTriangle extends Figure implements Diagonal{

    public RightTriangle(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    @Override
    public double area() {
        return (getWidth() * getHeight()) / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle: " + super.toString();
    }

    @Override
    public double diagonal() {
        double katet = getWidth();
        double katet2 = getHeight();
        return Math.sqrt(Math.pow(katet, 2) + Math.pow(katet2, 2));
    }

    public double height() {
        double katet = getWidth();
        double katet2 = getHeight();
        double hypotenuse = Math.sqrt(Math.pow(katet, 2) + Math.pow(katet2, 2));
        return (katet * katet2) / hypotenuse;
    }

    public boolean isTriangleIsosceles() {
        if (getWidth() == getHeight()) {
            return true;
        }
        return false;
    }
}
