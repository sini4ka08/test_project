package com.lern.homeWork.lesson7.exceptionStudents;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentCreator {

    private static ArrayList<Student> al = new ArrayList();

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("enter name: ");
        student.setName(scanner.nextLine());

        do {
            scanner = new Scanner(System.in);
            System.out.println("enter age: ");
            if (scanner.hasNextInt()) {
                student.setAge(scanner.nextInt());
                break;
            } else {
                System.out.println("Age format exception! Please enter only numbers");
            }
        } while (true);

        do {
            scanner = new Scanner(System.in);
            System.out.println("enter course: ");
            if (scanner.hasNextInt()) {
                student.setCourse(scanner.nextInt());
                break;
            } else {
                System.out.println("Course format exception! Please enter only numbers");
            }
        } while (true);

        scanner = new Scanner(System.in);
        System.out.println("enter phoneNumber: ");
        student.setPhoneNumber(scanner.nextLine());

        scanner = new Scanner(System.in);
        System.out.println("enter count balls: ");
        student.balls = new int[scanner.nextInt()];

        System.out.println("enter mas balls: ");
        for (int i = 0; i < student.balls.length; i++) {
            student.balls[i] = scanner.nextInt();
        }
        return student;
    }

    public static void addStudent(Student student) {
        al.add(student);
    }

    public static void showStudent() {
        for (Student student : al) {
            System.out.println(student.toString());
        }
    }

    public void showStudentByCourse(int course) {
        for (Student student : al) {
            if (student.getCourse() == course) {
                System.out.println(student.toString());
            }
        }
    }

    public void getStudentByCourseAndAge(int course, int age) {
        for (Student student : al) {
            if (student.getCourse() == course && student.getAge() == age) {
                System.out.println(student.toString());
            }
        }
    }
}