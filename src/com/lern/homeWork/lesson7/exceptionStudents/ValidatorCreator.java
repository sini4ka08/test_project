package com.lern.homeWork.lesson7.exceptionStudents;

import com.lern.homeWork.lesson7.exceptionStudents.exception.StudentFormatException;
import com.lern.homeWork.lesson7.exceptionStudents.exception.StudentSizeException;

public class ValidatorCreator {

    public static void validatorStudent(Student student) {
        validatorByName(student);
        validatorByAge(student);
        validatorByCourse(student);
        validatorByPhoneNumber(student);
    }

    private static void validatorByName(Student student) {
        if (!student.getName().matches("[A-ZА-Я][a-zа-я]+")) {
            throw new StudentFormatException("String format exception! Please enter only letters!");
        }
        if (student.getName().length() < 2 || student.getName().length() > 18) {
            throw new StudentSizeException("String size exception! Please enter size from 2 to 18!");
        }
    }

    private static void validatorByAge(Student student) {
        if (student.getAge() > 60 || student.getAge() < 17) {
            throw new StudentFormatException("Age not correct! Please enter age from 17 to 60!");
        }
    }

    private static void validatorByCourse(Student student) {
        if (student.getCourse() > 6 || student.getCourse() < 1) {
            throw new StudentFormatException("Course not correct! Please enter course from 1 to 6!");
        }
    }

    private static void validatorByPhoneNumber(Student student) {
        if (!student.getPhoneNumber().matches("((\\+375[\\d]{2})|(80[\\d]{2}))-[\\d]{3}-[\\d]{2}-[\\d]{2}")) {
            throw new StudentFormatException("String format or size exception! Please enter correct format +37529-274-83-79 size 13 or 8029-274-83-79 size 11!");
        }
    }
}
              /*scanner = new Scanner(System.in);
        System.out.println("enter count balls: ");
        int countBalls = scanner.nextInt();
        int ballsStud[];
        if (scanner.hasNextInt() && countBalls <= 60 && courseStud >= 1) {
            ballsStud = new int[countBalls];
            System.out.println("enter mas balls: ");
            for (int j = 0; j < ballsStud.length; j++) {
                if (scanner.hasNextInt() && balls[j] <= 10 && balls[j] >= 1) {
                    student.balls[j] = scanner.nextInt();
                }
            }
        } else {
            System.out.println("Entered incorrectly!");
        }*/

