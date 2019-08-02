package com.lern.homeWork.lesson6.extenseFigure;

public class MainFigure {

    public static void main(String[] args) {

        RightTriangle fig1 = new RightTriangle(new Point(1, 7), new Point(9, 3));
        System.out.println(fig1.toString());
        System.out.println(fig1.diagonal());
        System.out.println(fig1.height());
        System.out.println(fig1.isTriangleIsosceles());

        Rectangle fig2 = new Rectangle(new Point(1, 7), new Point(9, 3));
        System.out.println(fig2.toString());
        System.out.println(fig2.diagonal());

        Square fig3 = new Square(new Point(2, 5), new Point(5, 2));
        System.out.println(fig3.toString());
        System.out.println(fig3.diagonal());

        Circle fig4 = new Circle(new Point(2, 5), new Point(5, 2));
        System.out.println(fig4.toString());
        System.out.println(fig4.diameter());
        System.out.println(fig4.radius());

        Ellipse fig5 = new Ellipse(new Point(1, 4), new Point(4, 2));
        System.out.println(fig5.toString());
        System.out.println(fig5.lengthOfMajorAxis());
        System.out.println(fig5.lengthOfSmallerAxis());
        System.out.println();

        Figure fig6 = fig3;

        Figure shapes[] = new Figure[8];
        shapes[0] = new RightTriangle(new Point(1, 7), new Point(9, 3));
        shapes[1] = new RightTriangle(new Point(2, 5), new Point(5, 2));
        shapes[2] = new Rectangle(new Point(1, 7), new Point(9, 3));
        shapes[3] = new Rectangle(new Point(2, 6), new Point(7, 4));
        shapes[4] = new Square(new Point(2, 5), new Point(5, 2));
        shapes[5] = new Square(new Point(3, 4), new Point(4, 3));
        shapes[6] = new Ellipse(new Point(1, 4), new Point(4, 2));
        shapes[7] = new Circle(new Point(2, 5), new Point(5, 2));

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }
        System.out.println();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].whatIsIt());
        }
        System.out.println();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].equalsArea(fig3));
        }
        System.out.println();

        System.out.println(fig6.equals(fig3));
        System.out.println();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(ShapeUtils.isFigureTriangle(shapes[i]));
        }
        System.out.println();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(ShapeUtils.isFigureRectangle(shapes[i]));
        }
        System.out.println();
    }
}
