package com.lern.homeWork.lesson5.stringLibrary;

import java.util.Arrays;

/* Дан массив из N строк. Строки имеют произвольную длину.  Строки содержат слова,
состоящие из произвольных символов,  разделенных  символами ' '  ','  '.' N<=10.
Необходимо написать методы: 1) сортировка строк массива по количеству слов в строке.
2) выводящий значения длин всех строк массива. 3) выводящий строки с i по j из массива.
4) выводящий номер строки с максимальной цифрой. 5) удаляющий из i-ой строки все заглавные буквы.
6) удаляющий из i-ой строки все символы не буквы и не цифры. 7) выводящий из i-ой строки все слова,
содержащие только цифры. 8) вычисляющий сумму всех цифр i-ой строки. 9) выводящий из массива все слова,
содержащие только прописные буквы. 10) выводящий все числа из строк. 11) удаляющий из строку часть,
заключенную между двумя сим-волами, которые вводятся (например, между скобками ‘(’ и ‘)’ или
между звездочками ‘*’ и т.п.). 12) определяющий сколько в массиве одинаковых строк.
13) определяющий сколько в массиве одинаковых слов (выводить слово и количество повторений). */

public class WorkingWithStrings {

    private String str[];

    public WorkingWithStrings(int n) {
        str = new String[n];
    }

    public int getLength() {
        return str.length;
    }

    public void addByIndex(int index, String object) {
        str[index] = object;
    }

    public String toString() {                    // возвращаем не массив, а стринг1! Чтобы не испортить его!
        return Arrays.toString(str);
    }

    public String[] sortByCountWords() {
        String[] sortStr = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            sortStr[i] = str[i];  // это новый массив строк, кот б меняться местами
        }
        int countWords[] = new int[sortStr.length];  // каждая строка разбивается на массив слов, считаться кол слов
        for (int i = 0; i < sortStr.length; i++) {
            String words[] = sortStr[i].split(" ");
            countWords[i] = words.length;
        }
        System.out.println(Arrays.toString(countWords));
        for (int i = 0; i < countWords.length - 1; i++) {        // не верно выводит??
            for (int j = i + 1; j < countWords.length; j++) {
                if (countWords[i] < countWords[j]) {
                    String prev = sortStr[i];
                    sortStr[i] = sortStr[j];
                    sortStr[j] = prev;
                }
            }
        }
        return sortStr;
    }

    public int[] getLengthString() {
        int rezalt[] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            rezalt[i] = str[i].length();
        }
        return rezalt;
    }

    public void showFromToStrings(int fromNumberOfString, int toNumberOfString) {
        String rezalt[] = new String[str.length];    // toNumberOfString - fromNumberOfString + 1 - не работает
        for (int i = fromNumberOfString; i <= toNumberOfString; i++) {
            rezalt[i] = str[i];
        }
        System.out.println(Arrays.toString(rezalt));
    }

    public void showNumberMaxString() {    // выводящий номер строки с максимальной цифрой чего??
        int numberMaxString = str.length;
        System.out.println(numberMaxString);
    }

    public String dellLetterUpperCase(int numberOfString) {
        String string = new String();
        char chars[] = str[numberOfString].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                string = String.valueOf(chars).replace(chars[i], '_');  // как удалить вместо "_"???
            }
        }
        return string;
    }

}