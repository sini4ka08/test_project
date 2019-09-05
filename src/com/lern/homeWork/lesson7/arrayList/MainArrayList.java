package com.lern.homeWork.lesson7.arrayList;

import java.util.Arrays;
import java.util.List;

public class MainArrayList {

    public static void main(String[] args) {

        List<String> myArrayList = new MyArrayList();
        myArrayList.add("Thomas");
        myArrayList.add("Behemoth");
        myArrayList.add("Alex");
        myArrayList.add("Fiksik");
        myArrayList.add("Philipp");
        myArrayList.add("Pushok");
        myArrayList.add("Snejok");
        myArrayList.add("Simon");
        myArrayList.add("Shark");
        myArrayList.add("Cezar");

        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());

        System.out.println(myArrayList.contains("Philipp"));
        System.out.println(myArrayList.contains("Olia"));

        System.out.println(myArrayList.get(6));

        System.out.println(myArrayList.set(2, "Musik"));
        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.remove(9));
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());

        System.out.println(myArrayList.remove(4));
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());

        System.out.println(myArrayList.remove("Pushok"));
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());

        System.out.println(myArrayList.remove("Olia"));
        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.indexOf("Shark"));
        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.indexOf("Olia"));
        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.add("Sasha"));
        System.out.println(myArrayList.toString());

        myArrayList.add(4, "Sasha");
        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.size());
        System.out.println(myArrayList.lastIndexOf("Sasha"));
        System.out.println(myArrayList.toString());

        System.out.println(myArrayList.indexOf("Sasha"));
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());

        Object[] nameArray = myArrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(nameArray));

        try {
            myArrayList.add(9, "Pipi");
        } catch (RuntimeException badIndex) {
            System.out.println(badIndex.getMessage());
        }
        try {
            System.out.println(myArrayList.get(13));
        } catch (RuntimeException badIndex) {
            System.out.println(badIndex.getMessage());
        }
        try {
            System.out.println(myArrayList.set(14, "Gusik"));
        } catch (RuntimeException badIndex) {
            System.out.println(badIndex.getMessage());
        }
        try {
            System.out.println(myArrayList.remove(16));
        } catch (RuntimeException badIndex) {
            System.out.println(badIndex.getMessage());
        }

        myArrayList.clear();
        System.out.println(myArrayList.isEmpty());
    }
}
