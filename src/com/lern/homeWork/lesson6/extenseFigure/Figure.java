package com.lern.homeWork.lesson6.extenseFigure;

public abstract class Figure {

    private Point leftTopPoint;
    private Point rightBottomPoint;

    public Figure(Point leftTopPoint, Point rightBottomPoint) {
        this.leftTopPoint = leftTopPoint;
        this.rightBottomPoint = rightBottomPoint;
    }

    public double getWidth() {
        return Math.abs(getLeftTopPoint().getX() - getRightBottomPoint().getX());
    }

    public double getHeight() {
        return Math.abs(getLeftTopPoint().getY() - getRightBottomPoint().getY());
    }

    public String whatIsIt() {
        return this.getClass().getSimpleName();
    }

    public abstract double area();

    // Принимающий в качестве параметра фигуру и определяющий, равны ли площади текущей и полученной фигуры.
    public boolean equalsArea(Figure fig) {
        if (this.area() != fig.area()) {
            return false;
        }
        return true;
    }

    public boolean equals(Figure fig) {
        if (fig == null) {
            return false;
        }
        if (getClass() != fig.getClass()) {
            return false;
        }
        final Figure other = (Figure) fig;
        if (this.leftTopPoint != other.leftTopPoint) {
            return false;
        }
        if (this.rightBottomPoint != other.rightBottomPoint) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coordinates figure - leftTopPoint = " + leftTopPoint.toString() +
                ", rightBottomPoint = " + rightBottomPoint.toString();
    }

    public void setLeftTopPoint(Point leftTopPoint) {
        this.leftTopPoint = leftTopPoint;
    }

    public Point getLeftTopPoint() {
        return leftTopPoint;
    }

    public void setRightBottomPoint(Point rightBottomPoint) {
        this.rightBottomPoint = rightBottomPoint;
    }

    public Point getRightBottomPoint() {
        return rightBottomPoint;
    }
}
