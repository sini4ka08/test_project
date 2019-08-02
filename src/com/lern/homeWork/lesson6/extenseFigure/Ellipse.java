package com.lern.homeWork.lesson6.extenseFigure;

public class Ellipse extends Figure{

    public Ellipse(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    public double lengthOfMajorAxis() {
        double lengthOfMax = 0.0;
        if (Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX()) >
                Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY())) {
            lengthOfMax = Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX());
        } else {
            lengthOfMax = Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY());
        }
        return lengthOfMax;
    }

    public double lengthOfSmallerAxis() {
        double lengthOfMin = 0.0;
        if (Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX()) <
                Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY())) {
            lengthOfMin = Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX());
        } else {
            lengthOfMin = Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY());
        }
        return lengthOfMin;
    }

    @Override
    public double area() {
        return Math.PI * (lengthOfMajorAxis()/2 * lengthOfSmallerAxis()/2);
    }

    @Override
    public String toString() {
        return "Ellipse: " + super.toString();
    }
}
