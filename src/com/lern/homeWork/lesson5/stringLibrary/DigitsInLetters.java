package com.lern.homeWork.lesson5.stringLibrary;

import java.util.Scanner;

public class DigitsInLetters {
    public static void main(String[] args) {

        String num = "";
        char[] achNum;  // зачем??
        char curSymbol;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (sc.hasNextLine()) {
            num = sc.nextLine();
        }
        StringBuffer strBuf = new StringBuffer(num);
        strBuf.reverse();  // зачем - обращение содержимого объекта??
        num = null;     // зачем??
        for (int i = strBuf.length() - 1; i >= 0; i--) {
            curSymbol = strBuf.charAt(i);
            switch (i) {
                case 2: // сотни
                    printSotni(curSymbol);
                    break;
                case 1:// десятки
                    if (curSymbol != '1') {
                        printDeciatk(curSymbol);
                    } else {
                        i--;
                        curSymbol = strBuf.charAt(i);
                        printDeciatkWithEdinic(curSymbol);
                    }
                    break;
                case 0://единицы
                    printEdinic(curSymbol);
                    break;
                default:
                    System.out.println("Такие числа программа пока не выводит.");
                    return;
            }
        }
    }
    // печатает названия единиц
    public static void printEdinic(char i) {
        switch (i) {
            case '1':
                System.out.print("один ");
                break;
            case '2':
                System.out.print("два ");
                break;
            case '3':
                System.out.print("три ");
                break;
            case '4':
                System.out.print("четыре ");
                break;
            case '5':
                System.out.print("пять ");
                break;
            case '6':
                System.out.print("шесть ");
                break;
            case '7':
                System.out.print("семь ");
                break;
            case '8':
                System.out.print("восемь ");
                break;
            case '9':
                System.out.print("девять ");
                break;
        }
    }
    // печатает названия десятков
    public static void printDeciatk(char i) {
        switch (i) {
            case '1':
                System.out.print("десять ");
                break;
            case '2':
                System.out.print("двадцать ");
                break;
            case '3':
                System.out.print("тридцать ");
                break;
            case '4':
                System.out.print("сорок ");
                break;
            case '5':
                System.out.print("пятьдесят ");
                break;
            case '6':
                System.out.print("шестьдесят ");
                break;
            case '7':
                System.out.print("семьдесят ");
                break;
            case '8':
                System.out.print("восемьдесят ");
                break;
            case '9':
                System.out.print("девяносто ");
                break;
        }
    }
    public static void printDeciatkWithEdinic(char i) {
        switch (i) {
            case '0':
                System.out.print("десять ");
                break;
            case '1':
                System.out.print("одиннадцать ");
                break;
            case '2':
                System.out.print("двенадцать ");
                break;
            case '3':
                System.out.print("тринадцать ");
                break;
            case '4':
                System.out.print("четырнадцать ");
                break;
            case '5':
                System.out.print("пятнадцать ");
                break;
            case '6':
                System.out.print("шестнадцать ");
                break;
            case '7':
                System.out.print("семнадцать ");
                break;
            case '8':
                System.out.print("восемнадцать ");
                break;
            case '9':
                System.out.print("девятнадцать ");
                break;
        }
    }
    // печатает сотни
    public static void printSotni(char i) {
        switch (i) {
            case '1':
                System.out.print("сто ");
                break;
            case '2':
                System.out.print("двести ");
                break;
            case '3':
                System.out.print("триста ");
                break;
            case '4':
                System.out.print("четыреста ");
                break;
            case '5':
                System.out.print("пятьсот ");
                break;
            case '6':
                System.out.print("шестьсот ");
                break;
            case '7':
                System.out.print("семьсот ");
                break;
            case '8':
                System.out.print("восемьсот ");
                break;
            case '9':
                System.out.print("девятьсот ");
                break;
        }

    }
}
