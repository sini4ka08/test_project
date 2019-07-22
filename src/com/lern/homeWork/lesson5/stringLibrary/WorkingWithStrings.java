package com.lern.homeWork.lesson5.stringLibrary;

import java.util.Arrays;

/* Дан массив из N строк. Строки имеют произвольную длину.  Строки содержат слова,
состоящие из произвольных символов,  разделенных  символами ' '  ','  '.' N<=10.
Необходимо написать методы: 1) сортировка строк массива по количеству слов в строке.
2) выводящий значения длин всех строк массива. 3) выводящий строки с i по j из массива.
4) выводящий номер строки с максимальной цифрой. 5) удаляющий из i-ой строки все заглавные буквы.
6) удаляющий из i-ой строки все символы не буквы и не цифры. 7) выводящий из i-ой строки все слова,
содержащие только цифры. 8) вычисляющий сумму всех цифр i-ой строки. 9) выводящий из массива все слова,
содержащие только прописные буквы. 10) выводящий все числа из строк. 11) удаляющий из строки часть,
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
        /*int countWords[] = new int[sortStr.length];  // каждая строка разбивается на массив слов, считаться кол слов
        for (int i = 0; i < sortStr.length; i++) {
            String words[] = sortStr[i].split(" " );
            countWords[i] = words.length;
        }
        System.out.println(Arrays.toString(countWords));
        for (int i = 0; i < countWords.length - 1; i++) {        // не верно выводит??
            for (int j = i + 1; j < countWords.length; j++) {
                if (countWords[i] < countWords[j]) {
                    String prev = sortStr[i];
                    sortStr[i] = sortStr[j];    // не заменяю количество слов!!!
                    sortStr[j] = prev;
                }
            }
        }*/
        for (int i = 0; i < sortStr.length - 1; i++) {
            for (int j = i + 1; j < sortStr.length; j++) {
                if (sortStr[i].split("[\\s|,|\\.]").length < sortStr[j].split("[\\s|,|\\.]").length) {  // запятая не пропадает!
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
        for (int i = fromNumberOfString; i <= toNumberOfString; i++) {
            System.out.println(str[i]);
        }
    }

    public int getNumberStringWithMaxDigit() {    // выводящий номер строки с максимальной цифрой в строке!!!
        int numberOfString = 0;
        int maxRezalt = 0;
        for (int i = 0; i < str.length; i++) {
            Integer maxIntFromString = maxRezaltDigitString(str[i]);
            if (maxIntFromString != null) {
                if (maxRezalt < maxIntFromString) {
                    maxRezalt = maxIntFromString;
                    numberOfString = i;
                }
            }
        }
        return numberOfString;
    }

    private Integer maxRezaltDigitString(String str) {
        int maxRezalt = 0;
        boolean isFoundDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                isFoundDigit = true;
                if (maxRezalt < Integer.valueOf(str.charAt(i))) {
                    maxRezalt = Integer.valueOf(str.charAt(i));
                }
            }
        }
        if (isFoundDigit) {
            return maxRezalt;
        }
        return null;
    }

    public String dellLetterUpperCase(int numberOfString) {
        String string = str[numberOfString];
        return string.replaceAll("[А-Я|A-Z]", "");
    }

    public void dellCharNotLetterOrDigit(int numberOfString) {
        String string = str[numberOfString];
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetterOrDigit(string.charAt(i))) {
                System.out.print(string.charAt(i));
            }
        }
        System.out.println();
    }

    public void showWordOnlyWithDigit(int numberOfString) {
        String words[] = str[numberOfString].split("[\\s|,|\\.]");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[\\d]+")) {
                System.out.print(words[i] + "\t");
            }
        }
        System.out.println();
    }

    public int sumDigitString(int numberOfString) {
        int rezalt = 0;
        String string = str[numberOfString];
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                rezalt = rezalt + Integer.parseInt(String.valueOf(string.charAt(i)));
            }
        }
        return rezalt;
    }

    public void showWordOnlyUpperCase() {
        for (int i = 0; i < str.length; i++) {
            String words[] = str[i].split("[\\s|,|\\.]");
            for (int j = 0; j < words.length; j++) {
                if (words[j].matches("[А-Я|A-Z]+")) {
                    System.out.print(words[j] + "\t");
                }
            }
        }
        System.out.println();
    }

    public void showAllDigitString() {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (Character.isDigit(str[i].charAt(j))) {
                    System.out.print(str[i].charAt(j) + " ");
                }
            }
        }
        System.out.println();
    }

    public void showSubStringFromTo(char fromCharOfString, char toCharOfString) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].indexOf(fromCharOfString) != -1 && str[i].indexOf(toCharOfString) != -1) {
                System.out.println(str[i].substring(str[i].indexOf(fromCharOfString), str[i].indexOf(toCharOfString) + 1));
            }
        }
    }

    public int countOfDoublingString() {
        int countDoublingString = 0;
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    countDoublingString++;
                }
            }
        }
        return countDoublingString;
    }

    public void countOfIdenticalWords() {
        int countDoubling = 0;
        String strings = new String();
        for (int i = 0; i < str.length; i++) {
            strings = strings + str[i];
        }
        String words[] = strings.split("[\\s|,|\\.]");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i] == null) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    countDoubling++;
                    words[j] = null;
                }
            }
            if (countDoubling != 0) {
                System.out.print(words[i] + " " + countDoubling + " раз; ");
            }
            countDoubling = 0;
        }
        System.out.println();
    }
}
