package com.lern.homeWork.lesson6.extenseFigure;

public class Square extends Rectangle{

    public Square(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    @Override
    public String toString() {
        return "Square: " + super.toString();
    }
}

