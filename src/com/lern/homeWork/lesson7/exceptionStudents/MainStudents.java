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
                    + " 3-showListStudentsByCourse,"
                    + " 4-showListStudentsByCourseAndAge, 0-exit");
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
                    student.showStudent();
                    break;
                case 3:
                    do {
                        scanner = new Scanner(System.in);
                        System.out.println("enter course");
                        if (scanner.hasNextInt()) {
                            student.showStudentByCourse(scanner.nextInt());
                            break;
                        } else {
                            System.out.println("Course format exception! Please enter only numbers");
                        }
                    } while (true);
                    break;
                case 4:
                    System.out.println("enter course and age");
                    int course = 0;
                    do {
                        scanner = new Scanner(System.in);
                        System.out.println("enter course ");
                        if (scanner.hasNextInt()) {
                            course = scanner.nextInt();
                            break;
                        } else {
                            System.out.println("Course format exception! Please enter only numbers");
                        }
                    } while (true);
                    do {
                        scanner = new Scanner(System.in);
                        System.out.println("enter age ");
                        if (scanner.hasNextInt()) {
                            student.getStudentByCourseAndAge(course, scanner.nextInt());
                            break;
                        } else {
                            System.out.println("Age format exception! Please enter only numbers");
                        }
                    } while (true);
                    break;
            }
        } while (var != 0);
    }
}
