package com.lern.homeWork.lesson7.exceptionStudents;

import java.util.Arrays;
import java.util.Scanner;

public class StudentCreator {

    private Student studs[];

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("enter name: ");
        student.setName(scanner.nextLine());

        scanner = new Scanner(System.in);
        do {
            System.out.println("enter age: ");
            if (scanner.hasNextInt()) {
                student.setAge(scanner.nextInt());
                break;
            } else {
                System.out.println("Age format exception! Please enter only numbers");
                break;
            }
        } while (true);

        do {
            System.out.println("enter course: ");
            if (scanner.hasNextInt()) {
                student.setCourse(scanner.nextInt());
                break;
            } else {
                System.out.println("Age format exception! Please enter only numbers");
                break;
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

    public void createListOfStudent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter count of students");
        this.studs = new Student[scan.nextInt()];
        for (int i = 0; i < studs.length; i++) {
            studs[i] = createStudent();
            ValidatorCreator.validatorStudent(studs[i]);
        }
    }

    public String getStudentAsString() {
        return "studs=" + Arrays.toString(studs);
    }

    public void showStudentByCourse(int course) {
        String string = new String();
        for (Student student : studs) {
            if (student.getCourse() == course) {
                string = string + student.toString() + "\n";
            }
        }
        System.out.println(string);
    }

    public void getStudentByCourseAndAge(int course, int age) {
        String string = new String();
        for (Student student : studs) {
            if (student.getCourse() == course && student.getAge() == age) {
                string = string + student.toString() + "\n";
            }
        }
        System.out.println(string);
    }
}