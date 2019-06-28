package com.lern.homeWork.lesson3;

/* Напишите класс  Животные, содержаний поля – Имя, Возраст, Вес, Рост. Объявите три константы
Возраст, Вес, Рост в которые запишите  пороговые значения.  Создайте несколько объектов класса.
Напишите конструктор бес параметров и конструктор с параметрами. Напишите метод, выводящий все
данные о животном на консоль. Метод, определяющий одинаковые ли имена у двух животных. Метод,
сравнивающий поля объекта с пороговыми значениями Возраст, Вес, Рост (пример вывода :
старше 5 лет; легче 2 кг; выше 20 см ). */

public class Animals {
    private String name;
    private int age;
    private int weight;
    private int height;
    public static final int MAX_AGE = 5;
    public static final int MAX_WEIGHT = 20;
    public static final int MAX_HEIGHT = 50;

    public Animals() {
    }

    public Animals(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void show() {
        System.out.println("Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                "}");
    }

    public boolean equals(Animals obj) {
        if (obj.name == name) {
            return true;
        } else {
            return false;
        }
    }

    /*public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Animals an = (Animals) obj;
        return name.equals(an.name);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Animals)) return false;
        Animals an = (Animals) obj;
        return name.equals(an.name);
    }*/

    @Override                     // переделать
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                "}";
    }

    public String equalsPorog() {
        if (MAX_AGE > age) {
            return "младше на: " + (MAX_AGE - age) + " лет";
        } else if (MAX_AGE < age) {
            return "старше на: " + (age - MAX_AGE) + " лет";
        }
        if (MAX_WEIGHT > weight) {
            return "легче на: " + (MAX_WEIGHT - weight) + " кг";
        } else if (MAX_WEIGHT < weight) {
            return "тяжелее на: " + (weight - MAX_WEIGHT) + " кг";
        }
        if (MAX_HEIGHT > height) {
            return "ниже на: " + (MAX_HEIGHT - height) + " кг";
        } else if (MAX_HEIGHT < height) {
            return "выше на: " + (height - MAX_HEIGHT) + " кг";
        } else
            return "Error";
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
