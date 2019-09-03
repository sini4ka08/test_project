package com.lern.homeWork.lesson7.exceptionStudents;

import java.util.Arrays;

public class Student {

    private String name;
    private int age;
    private int course;
    private String phoneNumber;
    public int[] balls;
    private static int countStudent = 0;

    public Student() {
        countStudent++;
    }

    public Student(String name) {
        this.name = name;
        countStudent++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        countStudent++;
    }

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
        countStudent++;
    }

    public Student(String name, int... balls) {
        this.name = name;
        this.balls = balls;
        countStudent++;
    }

    public Student(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        countStudent++;
    }

    public Student(String name, int age, int course, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.phoneNumber = phoneNumber;
        countStudent++;
    }

    public Student(String name, int age, int course, String phoneNumber, int... balls) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.phoneNumber = phoneNumber;
        this.balls = balls;
        countStudent++;
    }

    private String forBallsInfo() {
        String ballsInfo = null;
        if (balls == null) {
            ballsInfo = " not have eny balls ";
        } else {
            ballsInfo = "balls=" + Arrays.toString(balls);
        }
        return ballsInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                ", course=" + course +
                ", phoneNumber=" + phoneNumber +
                ", " + forBallsInfo() +
                '}';
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getCountStudent() {
        return countStudent;
    }

    /*public void setBalls(int[] balls) {
        this.balls = Arrays.copyOf(balls, balls.length);
    }

    public int[] getBalls() {
        return Arrays.copyOf(balls, balls.length);
    }*/
}
