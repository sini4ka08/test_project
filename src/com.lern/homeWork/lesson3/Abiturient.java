package com.lern.homeWork.lesson3;

import java.util.Arrays;

/* Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
Создать  массив объектов. Вывести: a) список абитуриентов, имеющих неудовлетворительные оценки;
b) список абитуриентов, средний балл у которых выше заданного;
c) выбрать заданное число n абитуриентов, имеющих самый высокий средний балл
(вывести также полный список абитуриентов, имеющих полупроходной балл). */

public class Abiturient {

    private static int count;
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private String phoneNumber;
    public int[] balls;
    public double mediumBalls;

    public Abiturient() {
        id = count++;
    }

    public Abiturient(String surName, String name, String middleName, String address, String phoneNumber, int... balls) {
        id = count++;
        this.surName = surName;
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balls = balls;
        medium2();
    }

    public String toString() {
        return "Abiturient {" + "id=" + id + ", surName=" + surName + ", name=" + name +
                ", middleName=" + middleName + ", address=" + address + ", phoneNumber=" + phoneNumber +
                ", balls=" + Arrays.toString(balls) + "}";
    }

    public boolean isAbiturientBad() {
        boolean badAbit = false;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] < 5) {
                badAbit = true;
                break;
            }
        }
        return badAbit;
    }
    private void medium2() {
        this.mediumBalls=medium();
}
    public double medium() {
        double averageBalls = 0;
        double sum = 0;
        for (int i = 0; i < balls.length; i++) {
            sum = sum + balls[i];
        }
        averageBalls = sum / balls.length;
        return averageBalls;
    }

    public boolean isAverageBallsMoreThen(int ball) {
        boolean ismoreThanBall = true;
        if (medium() < ball) {
            ismoreThanBall = false;
        }
        return ismoreThanBall;
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
