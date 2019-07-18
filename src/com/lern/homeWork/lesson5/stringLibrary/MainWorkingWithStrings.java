package com.lern.homeWork.lesson5.stringLibrary;

import java.util.Arrays;

public class MainWorkingWithStrings {
    public static void main(String[] args) {

        int n = 5;
        WorkingWithStrings strings = new WorkingWithStrings(n);
        strings.addByIndex(0, "Любовь бывает разной, хочется верить в лучшее.");
        strings.addByIndex(1, "Бывает счастье далеко, бывает счастье рядом.");
        strings.addByIndex(2, "Надежда помогает жить.");
        strings.addByIndex(3, "Как тяжело учиться у любимого учителя, обиды от урока портят отношения.");
        strings.addByIndex(4, "Сказали лето будет теплым, а вот оно какое.");

        System.out.println(strings.toString());

        System.out.println(Arrays.toString(strings.sortByCountWords()));

        System.out.println(Arrays.toString(strings.getLengthString()));

        strings.showFromToStrings(1, 3);

        strings.showNumberMaxString();

        System.out.println(strings.dellLetterUpperCase(4));

    }

}
