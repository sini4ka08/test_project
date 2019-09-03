package com.lern.homeWork.lesson5.workWithText.sentencesAndWords;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class workWithText {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Ольга\\IdeaProjects\\test_project\\src\\com\\lern\\homeWork\\lesson5\\workWithText\\resources\\Compatible.txt";
        String myText = readUsingBufferedReader(fileName, StandardCharsets.UTF_8);
        System.out.println(myText);
        countOfSentencesAndWords(myText);
        showTheMostLongSentence(myText);
    }

    private static String readUsingBufferedReader(String fileName, Charset cs) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, cs);
        BufferedReader br = new BufferedReader(isr);
        String line;
        String all = new String();
        while ((line = br.readLine()) != null) {
            all += line;
        }
        br.close();
        return all;
    }

    public static void countOfSentencesAndWords(String fileName) {
        String sentences[] = fileName.split("[!|?|\\.]\\s*");
        String words[][] = new String[sentences.length][];
        for (int i = 0; i < sentences.length; ++i) {
            words[i] = sentences[i].split("[\\p{Punct}\\s]+");
        }
        System.out.println("Count sentences = " + sentences.length);
        System.out.println("Count words in the sentences: ");
        for (int i = 0; i < sentences.length; ++i) {
            System.out.print(" " + "[" + (i + 1) + "] = " + words[i].length + ";");
        }
        System.out.println();
    }

    public static void showTheMostLongSentence(String fileName) {
        String sentences[] = fileName.split("[!|?|\\.]\\s*");
        for (int i = 0; i < sentences.length - 1; i++) {
            for (int j = i + 1; j < sentences.length; j++) {
                if (sentences[i].length() < sentences[j].length()) {
                    String prev = sentences[i];
                    sentences[i] = sentences[j];
                    sentences[j] = prev;
                }
            }
        }
        System.out.println("The most long sentence = \"" + sentences[0] + "\"");
    }
}