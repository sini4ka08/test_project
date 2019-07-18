package com.lern.homeWork.lesson3;

import java.util.Scanner;

/* Разработать класс Книга. Поля – автор, название, год выпуска, количество страниц.
Конструктор пустой и конструктор с 4 параметрами. Написать методы, позволяющие менять
каждое из полей. Метод, который по названию книги, будет выводить всю информацию о книге.
Перегрузить методы по изменению полей, так чтобы новое значение поля можно было вводить
с клавиатуры. */

public class Book {

    private String author;
    private String title;
    private int year;
    private int numberOfPages;

    public Book() {
    }

    public Book(String author, String title, int year, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return "Book {" + "author=" + author + ", title=" + title +
                ", year=" + year + ", numberOfPages=" + numberOfPages + "}";
    }

    public void authorChange(String author) {
        this.author = author;
    }

    public void titleChange(String title) {
        this.title = title;
    }

    public void yearChange(int year) {
        this.year = year;
    }

    public void numberOfPagesChange(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void authorChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter new author");
        String n = scanner.nextLine();
        this.author = n;
    }

    public void titleChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter new title");
        String n = scanner.nextLine();
        this.title = n;
    }

    public void yearChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter new year");
        int n = scanner.nextInt();
        this.year = n;
    }

    public void numberOfPagesChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter new number of pages");
        int n = scanner.nextInt();
        this.numberOfPages = n;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}
