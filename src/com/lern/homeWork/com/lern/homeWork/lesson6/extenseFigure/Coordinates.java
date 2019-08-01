package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

public class Coordinates {

    private Point leftTopPoint;
    private Point rightBottomPoint;

    public Coordinates(Point leftTopPoint, Point rightBottomPoint) {
        this.leftTopPoint = leftTopPoint;
        this.rightBottomPoint = rightBottomPoint;
    }

    @Override
    public String toString() {
        return "Coordinates - leftTopPoint = " + leftTopPoint.toString() +
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


