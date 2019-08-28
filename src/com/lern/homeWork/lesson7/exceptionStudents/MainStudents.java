package com.lern.homeWork.lesson7.exceptionStudents;

import com.lern.homeWork.lesson7.exceptionStudents.exception.StudentFormatException;
import com.lern.homeWork.lesson7.exceptionStudents.exception.StudentSizeException;

import java.util.Scanner;

import static com.lern.homeWork.lesson7.exceptionStudents.StudentCreator.addStudent;

public class MainStudents {

    public static void main(String[] args) {

        int var = 0;
        StudentCreator student = new StudentCreator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1-createStudent, 2-showStudent,"
                    + " 3-createListOfStudents,"
                    + " 4-showListStudentsByCourse,"
                    + " 5-showListStudentsByCourseAndAge, 0-exit");
            var = scanner.nextInt();

            switch (var) {
                case 1:
                    try {
                        Student stud = student.createStudent();
                        ValidatorCreator.validatorStudent(stud);
                        addStudent(stud);
                    } catch (StudentFormatException format) {
                        System.out.println(format.getMessage());
                    } catch (StudentSizeException size) {
                        System.out.println(size.getMessage());
                    }
                    break;
                case 2:
                    try {
                        student.iterStudent();
                    } catch (NullPointerException null1) {
                        System.out.println("Нет созданного студента.");
                    }
                    break;
                case 3:
                    try {
                        student.createListOfStudents();
                    } catch (StudentFormatException format) {
                        System.out.println(format.getMessage());
                    } catch (StudentSizeException size) {
                        System.out.println(size.getMessage());
                    }
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("enter course");
                    try {
                        student.showStudentByCourse(scanner.nextInt());
                    } catch (NullPointerException null2) {
                        System.out.println("Нет списка студентов");
                    }
                    break;
                case 5:
                    scanner = new Scanner(System.in);
                    System.out.println("enter course and age");
                    System.out.println("enter course ");
                    int course = scanner.nextInt();
                    System.out.println("enter age ");
                    try {
                        student.getStudentByCourseAndAge(course, scanner.nextInt());
                    } catch (NullPointerException null3) {
                        System.out.println("Нет списка студентов.");
                    }
                    break;
            }
        } while (var != 0);
    }
}
