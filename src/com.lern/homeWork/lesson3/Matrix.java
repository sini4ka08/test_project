package com.lern.homeWork.lesson3;

import java.util.Arrays;
/* Определите класс для матриц. Напишите перегруженные конструктор для создания
одномерной и двумерной матриц. В конструкторы передаются размерности матриц.
(В конструктор для одномерной матрицы передается один параметр, для двумерной два).
Напишите методы для выведения, сложения, вычитания и умножения матриц. */

public class Matrix {
    public int[] mas;
    public int[][] mas2;

    public Matrix(int n) {
        this.mas = new int[n];
    }
    public Matrix(int a, int b) {
        this.mas2 = new int[a][b];
    }
   /* private String getMasToStringCorrect() {
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
                '}';*/
    }
