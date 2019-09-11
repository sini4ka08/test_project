package com.lern.homeWork.lesson3;

import java.util.Scanner;

public class MainAnimals {

    public static void main(String[] args) {

        Animals cat = new Animals();
        cat.setName("Marusia");
        cat.setAge(7);
        cat.setWeight(10);
        cat.setHeight(30);
        Animals dog = new Animals("Caezar", 9, 3, 15);
        Animals tiger = new Animals("Tigrulia", 5, 30, 50);
        cat.show();
        dog.show();
        tiger.show();

        System.out.println("cat == dog: " + cat.getName().equals(dog.getName()));
        System.out.println("cat == tiger: " + cat.getName().equals(tiger.getName()));

        System.out.println("Поля объекта в сравнении с пороговыми значениями - cat - " + cat.equalsPorog());
        System.out.println("Поля объекта в сравнении с пороговыми значениями - dog - " + dog.equalsPorog());
        System.out.println("Поля объекта в сравнении с пороговыми значениями - tiger - " + tiger.equalsPorog());
        System.out.println();
    }

}
