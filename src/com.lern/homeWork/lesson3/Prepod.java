package com.lern.homeWork.lesson3;

import java.util.Arrays;

public class Prepod {

    public String name;
    public String position;
    private Student studs[];
    private  int countStudent=0;

    public Prepod(String name, String position, int count) {
        this.name = name;
        this.position = position;
        this.studs = new Student[count];
    }

    public void addStudent(Student student){
        studs[countStudent]=student;
        student.setPrepod(this);
        countStudent++;
    }

    public int getMaxCount(){
        return studs.length;
    }

    public int getCountStudent() {
        return countStudent;
    }

    @Override
    public String toString() {
        return "Prepod{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", studs=" + Arrays.toString(studs) +
                ", countStudent=" + countStudent +
                '}';
    }
}
