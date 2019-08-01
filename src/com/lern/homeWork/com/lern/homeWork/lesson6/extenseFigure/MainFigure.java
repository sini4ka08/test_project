package com.lern.homeWork.com.lern.homeWork.lesson6.extenseFigure;

import java.util.Arrays;

public class MainFigure {

    public static void main(String[] args) {

        Triangle fig1 = new Triangle(new Point(1, 7), new Point(9, 3));
        System.out.println(fig1.toString());
        System.out.println(fig1.hypotenuse());
        System.out.println(fig1.height());
        System.out.println(fig1.isTriangleIsosceles());

        Rectangle fig2 = new Rectangle(new Point(1, 7), new Point(9, 3));
        System.out.println(fig2.toString());
        System.out.println(fig2.isSquare());
        System.out.println(fig2.diagonal());

        Square fig3 = new Square(new Point(2, 5), new Point(5, 2));
        System.out.println(fig3.toString());
        System.out.println(fig3.isSquare());
        System.out.println(fig3.diagonal());

        Circle fig4 = new Circle(new Point(2, 5), new Point(5, 2));
        System.out.println(fig4.toString());
        System.out.println(fig4.isCircle());

        Ellipse fig5 = new Ellipse(new Point(1, 4), new Point(4, 2));
        System.out.println(fig5.toString());
        System.out.println(fig5.isCircle());

        Coordinates shapes[] = new Coordinates[8];
        shapes[0] = new Triangle(new Point(1, 7), new Point(9, 3));
        shapes[1] = new Triangle(new Point(2, 5), new Point(5, 2));
        shapes[2] = new Rectangle(new Point(1, 7), new Point(9, 3));
        shapes[3] = new Rectangle(new Point(2, 6), new Point(7, 4));
        shapes[4] = new Square(new Point(2, 5), new Point(5, 2));
        shapes[5] = new Square(new Point(3, 4), new Point(4, 3));
        shapes[6] = new Ellipse(new Point(1, 4), new Point(4, 2));
        shapes[7] = new Circle(new Point(2, 5), new Point(5, 2));

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }

        Area figures[] = new Area[5];
        figures[0] = new Triangle(new Point(1, 7), new Point(9, 3));
        figures[1] = new Rectangle(new Point(1, 7), new Point(9, 3));
        figures[2] = new Square(new Point(2, 5), new Point(5, 2));
        figures[3] = new Ellipse(new Point(1, 4), new Point(4, 2));
        figures[4] = new Circle(new Point(2, 5), new Point(5, 2));

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].area());
        }
        System.out.println();

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].equals(fig1));
            System.out.println(figures[i].equals(fig2));
        }
        System.out.println();

        for (int i = 0; i < figures.length; i++) {
            System.out.println(ShapeUtils.isFigureRectangle(figures[i]));
            System.out.println(ShapeUtils.isFigureTriangle(figures[i]));
        }
        System.out.println();
    }
}
