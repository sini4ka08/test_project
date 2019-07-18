package com.lern.homeWork.lesson5.stringLibrary;

import java.util.Arrays;
import java.util.Scanner;

public class MainArrayString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter count string");
        int countString = scan.nextInt();
        ArrayString arrayString = new ArrayString(countString);

        for (int i = 0; i < arrayString.getLength(); i++) {
            scan = new Scanner(System.in);
            System.out.println("enter new string");
            String string = scan.nextLine();
            if (string.contains("end")) {
                arrayString.addByIndex(i, string);
                for (int j = i + 1; j < arrayString.getLength(); j++) {
                    arrayString.addByIndex(j, String.valueOf(j));
                }
                break;
            }
            arrayString.addByIndex(i, string);
        }

        System.out.println(arrayString.toString());

        System.out.println(Arrays.toString(arrayString.sortByLengthString()));

        System.out.println(arrayString.isMatchStringInArray());

        arrayString.showLastElementsOfMostLengthString();

        System.out.println(arrayString.upperCase(1));

        System.out.println(arrayString.toString());
    }
}
