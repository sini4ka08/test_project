package com.lern.homeWork.lesson3;

import java.util.Arrays;

public class Student {

    private String name;
    private int age;
    private int course;
    //public int []balls=new int[20];1 var
    public int[] balls;
    private Prepod prepod;
    private static int countStudent=0;

    public Student(String name, int age, int countBalls) {
        this.age = age;
        this.name = name;
        this.balls = new int[countBalls];
        countStudent++;
        // this.balls=new int[20]; 2 var
    }

    public Prepod getPrepod() {
        return prepod;
    }

    public static int getCountStudent() {
        return countStudent;
    }

    public void setPrepod(Prepod prepod) {
        this.prepod = prepod;
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
        countStudent++;
    }

    public Student() {
        countStudent++;
    }

    public Student(int age) {
        this.age = age;
        countStudent++;
    }

    public Student(int course, int age) {
        this.course = course;
        this.name = name;
        countStudent++;
    }

    public Student(int course, String name) {
        this.name = name;
        this.course = course;
        countStudent++;
    }

    public Student(String name) {
        this.name = name;
        countStudent++;
    }

    private String getMasToStringCorrect() {
        String elems = new String("[");
        for (int i=0 ;i<balls.length;i++) {
            elems += balls[i] + ",";
        }
        elems += "]";
        return elems;
    }

    public void show() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", balls=" + getMasToStringCorrect() +
                '}');
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", balls=" + Arrays.toString(balls) +
                ", prepod=" + prepod.name +" position " +prepod.position+
                '}';
    }

    public void show(String param) {

        if (param.equals("name")) {
            System.out.println(name);
        } else if (param.equals("age")) {
            System.out.println(age);
        } else {
            System.out.println(course);
        }
    }

    public void show(String param, int i) {
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
}
