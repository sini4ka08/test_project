package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

public class Triangle extends Coordinates implements Area{

    public Triangle(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    @Override
    public double area() {
        return (Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX()) *
                Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY())) / 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangle other = (Triangle) obj;
        if (this.area() != other.area()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString();
    }

    public double hypotenuse() {
        double katet = Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX());
        double katet2 = Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY());
        return Math.sqrt((katet * katet) + (katet2 * katet2));
    }

    public double height() {
        double katet = Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX());
        double katet2 = Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY());
        double hypotenuse = Math.sqrt((katet * katet) + (katet2 * katet2));
        return (katet * katet) / hypotenuse;
    }

    public boolean isTriangleIsosceles() {
        if (getLeftTopPoint().getX() == getRightBottomPoint().getY() &&
                getLeftTopPoint().getY() == getRightBottomPoint().getX()) {
            return true;
        }
        return false;
    }
}
