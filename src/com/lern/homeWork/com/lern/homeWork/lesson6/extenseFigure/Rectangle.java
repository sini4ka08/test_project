package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

public class Rectangle extends Coordinates implements Area{

    public Rectangle(Point leftTopPoint, Point rightBottomPoint) {
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
        final Rectangle other = (Rectangle) obj;
        if (this.area() != other.area()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString();
    }

    public double diagonal () {
        double katet = Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX());
        double katet2 = Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY());
        return Math.sqrt((katet * katet) + (katet2 * katet2));
    }

    public boolean isSquare() {
        if (getLeftTopPoint().getX() == getRightBottomPoint().getY() &&
                getLeftTopPoint().getY() == getRightBottomPoint().getX()) {
            return true;
        }
        return false;
    }
}
