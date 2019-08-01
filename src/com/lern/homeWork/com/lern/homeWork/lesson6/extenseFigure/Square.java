package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

public class Square extends Rectangle implements Area {

    public Square(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    @Override
    public double area() {
        return Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX()) *
                Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Square other = (Square) obj;
        if (this.area() != other.area()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Square: " + super.toString();
    }
}

