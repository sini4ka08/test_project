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
            throw new StudentFormatException("String format NAME exception! Please enter only letters. The first letter is uppercase!");
        }
        if (student.getName().length() < 2 || student.getName().length() > 18) {
            throw new StudentSizeException("String size NAME exception! Please enter size from 2 to 18!");
        }
    }

    private static void validatorByAge(Student student) {
        if (student.getAge() > 60 || student.getAge() < 17) {
            throw new StudentFormatException("AGE not correct! Please enter age from 17 to 60!");
        }
    }

    private static void validatorByCourse(Student student) {
        if (student.getCourse() > 6 || student.getCourse() < 1) {
            throw new StudentFormatException("COURSE not correct! Please enter course from 1 to 6!");
        }
    }

    private static void validatorByPhoneNumber(Student student) {
        if (!student.getPhoneNumber().matches("((\\+375[\\d]{2})|(80[\\d]{2}))-[\\d]{3}-[\\d]{2}-[\\d]{2}")) {
            throw new StudentFormatException("String format or size PHONE NUMBER exception! Please enter correct format +375XX-XXX-XX-XX size 13 or 80XX-XXX-XX-XX size 11!");
        }
    }
}


