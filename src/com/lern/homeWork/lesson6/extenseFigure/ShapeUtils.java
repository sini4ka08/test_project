package com.lern.homeWork.lesson6.extenseFigure;

public class ShapeUtils {

    public static boolean isFigureRectangle(Figure fig) {
        if (fig == null) {
            return false;
        }
        if (Rectangle.class != fig.getClass()) {
            return false;
        }
        return true;
    }

    public static boolean isFigureTriangle(Figure fig) {
        if (fig == null) {
            return false;
        }
        if (RightTriangle.class != fig.getClass()) {
            return false;
        }
        return true;
    }
}
