package com.lern.homeWork.lesson5.stringLibrary;

/*Написать класс для хранения информации о людях. В конструктор передается один параметр String,
в котором через ; перечисляется имя, возраст, вес, рост – пример: ("Alex; 45; 90; 185").
В конструкторе по этому параметру заполняются соответственно 4 поля (имя, возраст, вес, рост).
Метод, в который передается аналогичная строка ("Serg; 25; 80; 180") и делается сравнение
всех полей для данного объекта с данными из строки. Метод, выводящий всю информацию об объекте.
Методы для изменения каждого из полей. */

public class People {

    private String name;
    private int age;
    private int weight;
    private int growth;
    private String infoAboutPerson;

    public People(String infoAboutPerson) {
        String allInfo[] = infoAboutPerson.split("; ");
        name = allInfo[0];
        age = Integer.parseInt(allInfo[1]);
        weight = Integer.parseInt(allInfo[2]);
        growth = Integer.parseInt(allInfo[3]);
    }

    /*public boolean comparePeople(String infoAboutPerson) {
        String allInfo[] = infoAboutPerson.split("; ");
        boolean rezalt = false;
        if (name.equals(allInfo[0]) || age == Integer.parseInt(allInfo[1]) ||
                weight == Integer.parseInt(allInfo[2]) || growth == Integer.parseInt(allInfo[3])) {
            rezalt = true;
        }
        return rezalt;
    }*/

    public String comparePeople(String infoAboutPerson) {
        String allInfo[] = infoAboutPerson.split("; ");
        String rezalt = new String("People");
        if (name.equals(allInfo[0])) {
            rezalt = rezalt + " одинаковые имена: " + name;
        } else {
            rezalt = rezalt + " неодинаковые имена";
        }
        if (age == Integer.parseInt(allInfo[1])) {
            rezalt = rezalt + ", одинаковый возраст: " + age;
        } else if (age < Integer.parseInt(allInfo[1])) {
            rezalt = rezalt + ", младше на: " + (Integer.parseInt(allInfo[1]) - age) + " лет";
        } else {
            rezalt = rezalt + ", старше на: " + (age - Integer.parseInt(allInfo[1])) + " лет";
        }
        if (weight == Integer.parseInt(allInfo[2])) {
            rezalt = rezalt + ", одинаковый вес: " + weight;
        } else if (weight < Integer.parseInt(allInfo[2])){
            rezalt = rezalt + ", легче на: " + (Integer.parseInt(allInfo[2]) - weight) + " кг";
        } else {
            rezalt = rezalt + ", тяжелее на: " + (weight - Integer.parseInt(allInfo[2])) + " кг";
        }
        if (growth == Integer.parseInt(allInfo[3])) {
            rezalt = rezalt + ", одинаковый рост: " + growth;
        } else if (growth < Integer.parseInt(allInfo[3])) {
            rezalt = rezalt + ", ниже на: " + (Integer.parseInt(allInfo[3]) - growth) + " см";
        } else {
            rezalt = rezalt + ", выше на: " + (weight - Integer.parseInt(allInfo[2])) + " см";
        }
        return rezalt;
    }

    public void showAllInfoAboutPerson() {
        System.out.println("People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", growth=" + growth + '}');
    }

    public void nameChange(String name) {
        this.name = name;
    }

    public void ageChange(int age) {
        this.age = age;
    }

    public void weightChange(int weight) {
        this.weight = weight;
    }

    public void growthChange(int growth) {
        this.growth = growth;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getGrowth() {
        return growth;
    }
    public void setGrowth(int growth) {
        this.growth = growth;
    }
}
