package com.lern.homeWork.lesson7.exceptionStudents;

import com.lern.homeWork.lesson7.exceptionStudents.exception.StudentFormatException;
import com.lern.homeWork.lesson7.exceptionStudents.exception.StudentSizeException;

import java.util.Scanner;

public class MainStudents {

    public static void main(String[] args) {

        int var = 0;
        StudentCreator student = new StudentCreator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1-createStudent, 2-createListOfStudents,"
                    + " 3-showListOfStudents, 4-showListStudentsByCourse,"
                    + " 5-showListStudentsByCourseAndAge, 0-exit");
            var = scanner.nextInt();

            switch (var) {
                case 1:
                    try {
                        ValidatorCreator.validatorStudent(student.createStudent());
                    } catch (StudentFormatException format) {
                        System.out.println(format.getMessage());
                    } catch (StudentSizeException size) {
                        System.out.println(size.getMessage());
                    }
                    break;
                case 2:
                    try {
                    student.createListOfStudent();
                    } catch (StudentFormatException format) {
                        System.out.println(format.getMessage());
                    } catch (StudentSizeException size) {
                        System.out.println(size.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(student.getStudentAsString());
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("enter course");
                    try {
                        student.showStudentByCourse(scanner.nextInt());
                    } catch (NullPointerException null1){
                    System.out.println("Нет списка студентов. Сначала введите в меню №2.");
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
                    } catch (NullPointerException null2) {
                        System.out.println("Нет списка студентов. Сначала введите в меню №2.");
                    }
                    break;
            }
        } while (var != 0);
    }
}
