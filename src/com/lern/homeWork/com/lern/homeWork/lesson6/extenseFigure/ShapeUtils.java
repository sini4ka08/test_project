package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

public class ShapeUtils {

    public static boolean isFigureRectangle(Object obj) {
        if (obj == null) {
            return false;
        }
        if (Rectangle.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static boolean isFigureTriangle(Object obj) {
        if (obj == null) {
            return false;
        }
        if (Triangle.class != obj.getClass()) {
            return false;
        }
        return true;
    }
}
