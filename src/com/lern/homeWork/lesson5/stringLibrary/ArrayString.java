package com.lern.homeWork.lesson5.stringLibrary;

import java.util.Arrays;

/* Написать класс, в котором как поле объявлен массив строк. Вводим количество строк с консоли.
Организовать ввод строк с консоли до тех пор, пока в какой-то строке не встретится слово end,
остальные строки заполняются цифрами = номер строки. Отсортируйте строки по длине. Определите,
есть ли среди строк одинаковые. Выведите 3 последних элемента самой длинной строки.
Преобразуйте 2 строку к верхнему регистру. */

public class ArrayString {

    private final String str[];

    public ArrayString(int countString) {
        str = new String[countString];
    }

    public int getLength() {
        return str.length;
    }

    public void addByIndex(int index, String object) {
        str[index] = object;
    }

    public String[] sortByLengthString() {
        String[] sortStr = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            sortStr[i] = str[i];       // чтобы не испортить наш массив!
        }
        for (int i = 0; i < sortStr.length - 1; i++) {
            for (int j = i + 1; j < sortStr.length; j++) {
                if (sortStr[i].length() < sortStr[j].length()) {
                    String prev = sortStr[i];
                    sortStr[i] = sortStr[j];
                    sortStr[j] = prev;
                }
            }
        }
        return sortStr;
    }

    /*public boolean isMatchStringInArray() {    // var 1!
        boolean rezalt = false;
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    rezalt = true;
                    break;
                }
            }
        }
        return rezalt;
    }*/

    public boolean isMatchStringInArray() {    // var 2!
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    /*public String getLastElementsOfMostLengthString() {  // var 1! - слишком долго!
        String mostLengthString = sortByLengthString()[0];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = mostLengthString.length()-1; i > mostLengthString.length()-4; i--) {
            stringBuilder.append(mostLengthString.charAt(i));
            stringBuilder.append("\t");

        }
        return stringBuilder.toString();  // вернуть toString
    }*/

    public void showLastElementsOfMostLengthString() {  // var 2!
        String maxLength = str[0];
        for (int i = 1; i < str.length; i++) {
            if (maxLength.length() < str[i].length()) {
                maxLength = str[i];
            }
        }
        /* System.out.println(maxLength.charAt(maxLength.length()-1));
        System.out.println(maxLength.charAt(maxLength.length()-2));
        System.out.println(maxLength.charAt(maxLength.length()-3)); */
        for (int i = maxLength.length()-1; i > maxLength.length()-4; i--) {
            System.out.println(maxLength.charAt(i));
        }
    }

    public String upperCase(int numberOfString) {  // возвращаем не массив, а стринг! Чтобы не испортить его!
        return str[numberOfString].toUpperCase();
    }

    public String toString() {                    // возвращаем не массив, а стринг1! Чтобы не испортить его!
        return Arrays.toString(str);
    }
}
