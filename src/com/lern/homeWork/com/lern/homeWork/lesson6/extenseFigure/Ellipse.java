package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

public class Ellipse extends Coordinates implements Area{

    public Ellipse(Point leftTopPoint, Point rightBottomPoint) {
        super(leftTopPoint, rightBottomPoint);
    }

    @Override
    public double area() {
        return Math.PI * (Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX())/2 *
                Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY())/2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ellipse other = (Ellipse) obj;
        if (this.area() != other.area()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ellipse: " + super.toString();
    }

    public boolean isCircle() {
        if (getLeftTopPoint().getX() == getRightBottomPoint().getY() &&
                getLeftTopPoint().getY() == getRightBottomPoint().getX()) {
            return true;
        }
        return false;
    }
}
