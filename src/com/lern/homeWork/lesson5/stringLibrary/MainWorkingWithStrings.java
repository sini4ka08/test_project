package com.lern.homeWork.lesson5.stringLibrary;

import java.util.Arrays;

public class MainWorkingWithStrings {
    public static void main(String[] args) {

        int n = 6;
        if (n <= 10) {
            WorkingWithStrings strings = new WorkingWithStrings(n);
            strings.addByIndex(0, "ЛЮБОВЬ бывает# разной4,(хочется5 веритьR) В лучшее.");
            strings.addByIndex(1, "Бывает@ (счастьеT далеко8,бывает счастье8) рядом.");
            strings.addByIndex(2, "(Надежда%) 777 помогаетS ЖИТЬ9 666.");
            strings.addByIndex(3, "Как (тяжело& *учиться у любимого7* учителя) далеко8,обидыW от урока6 портят отношения.");
            strings.addByIndex(4, "Сказали5 лето_- будетZ теплым^,*а7 вот оно какое*.");
            strings.addByIndex(5, "Бывает@ (счастьеT далеко8,бывает счастье8) рядом.");

            System.out.println(strings.toString());

            System.out.println(Arrays.toString(strings.sortByCountWords()));

            System.out.println(Arrays.toString(strings.getLengthString()));

            strings.showFromToStrings(1, 3);

            System.out.println(strings.getNumberStringWithMaxDigit());

            System.out.println(strings.dellLetterUpperCase(0));

            strings.dellCharNotLetterOrDigit(4);

            strings.showWordOnlyWithDigit(2);

            System.out.println(strings.sumDigitString(1));

            strings.showWordOnlyUpperCase();

            strings.showAllDigitString();

            strings.showSubStringFromTo('(', ')');

            System.out.println("count of identical string = " + strings.countOfDoublingString());

            strings.countOfIdenticalWords();
        }
    }
}
