package com.lern.homeWork.lesson3;

import java.util.Scanner;

public class MainBook {

    public static void main(String[] args) {

        Book sinicina = new Book("Sinicina", "Believe", 2007, 354);
        Book zaretskiy = new Book("Zaretskiy", "Hope", 2010, 405);
        Book bulko = new Book("Bulko", "Love", 2012, 500);

        Book[] books = new Book[]{sinicina, zaretskiy, bulko};

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

        sinicina.titleChange("Peace");
        zaretskiy.yearChange(2011);
        bulko.numberOfPagesChange(456);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter title");
        String n = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(n)) {
                System.out.println("Book {" + "author=" + books[i].getAuthor() + ", title=" + books[i].getTitle() +
                        ", year=" + books[i].getYear() + ", numberOfPages=" + books[i].getNumberOfPages() + "}");
            }
        }

        sinicina.titleChange();
        zaretskiy.yearChange();
        bulko.numberOfPagesChange();

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
}
