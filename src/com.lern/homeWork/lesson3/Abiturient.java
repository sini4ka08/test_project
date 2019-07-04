package com.lern.homeWork.lesson3;

import java.util.Arrays;

/* Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
Создать  массив объектов. Вывести: a) список абитуриентов, имеющих неудовлетворительные оценки;
b) список абитуриентов, средний балл у которых выше заданного;
c) выбрать заданное число n абитуриентов, имеющих самый высокий средний балл
(вывести также полный список абитуриентов, имеющих полупроходной балл). */

public class Abiturient {

    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private String phoneNumber;
    public int[] balls;
    public static final int MAX_BALL = 10;

    public Abiturient() {
    }

    public Abiturient(int id, String surName, String name, String middleName, String address, String phoneNumber, int... balls) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balls = balls;
    }

    public String toString() {
        return "Abiturient {" + "id=" + id + ", surName=" + surName + ", name=" + name +
                ", middleName=" + middleName + ", address=" + address + ", phoneNumber=" + phoneNumber +
                ", balls=" + Arrays.toString(balls) + "}";
    }

    public void isAbiturientBad() {
        String string = new String();
        for (int i = 0; i < balls.length; i++) {
                if (balls[i] < 5) {
                    string = surName + " имеет неудовлетворительные оценки"; // как сделать список? не плодить пустые строки?
                }
            }
        System.out.println(string);
    }

    public double medium() {
        double averageBalls = 1;
        double sum = 0;
        for (int i = 0; i < balls.length; i++) {
            sum = sum + balls[i];
        }
        averageBalls = sum / balls.length;
        return averageBalls;
    }

    public void isAbiturientAboveAverage() {
        String string = new String();
        double sum = 0;
        for (int i = 0; i < balls.length; i++) {
            sum = sum + balls[i];
        }
        if ((sum / balls.length) > 6.0) {
            string = surName + " имеет средний балл выше 6";  // как сделать список? не плодить пустые строки?
        }
        System.out.println(string);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
