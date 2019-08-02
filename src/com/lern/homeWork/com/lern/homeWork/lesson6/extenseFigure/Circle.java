package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

public class Circle extends Ellipse implements Area {

    public Circle(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    @Override
    public double area() {
        return Math.PI * (Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX()) / 2 *
                Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY()) / 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        if (this.area() != other.area()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString();
    }
}
