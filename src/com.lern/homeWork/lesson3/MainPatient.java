package com.lern.homeWork.lesson3;

import java.util.Scanner;

public class MainPatient {

    public static void main(String[] args) {

        Patient ivanova = new Patient("Ivanova", "Svetlana", "Fedorovna", "s.Minsk, avenue Pushkina, 65-234", "8(029)356-74-89", 123000, "sore throat");
        Patient petrova = new Patient("Petrova", "Alena", "Sergeevna", "s.Minsk, square Lenina, 19-21", "8(025)356-82-17", 456000, "headache");
        Patient sinicin = new Patient("Sinicin", "Oleg", "Andreevich", "s.Minsk, st. Yakubovskogo, 78-256", "8(029)274-83-79", 789000, "back hurts");
        Patient zaretskia = new Patient("Zaretskia", "Aleksandra", "Eduardovna", "s.Minsk, st. Goshkevicha, 18-90", "8(025)938-04-88", 234000, "stomachache");
        Patient mulko = new Patient("Mulko", "Evgeniy", "Vladimirovich", "s.Minsk, st. Leschinskogo, 38-411", "8(029)241-23-63", 567000, "toothache");

        Patient[] patients = new Patient[]{ivanova, petrova, sinicin, zaretskia, mulko};
        for (int i = 0; i < patients.length; i++) {
            System.out.println(patients[i].toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter diagnosis");
        String n = scanner.nextLine();
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getDiagnosis().equals(n)) {
                System.out.println("Patient " + patients[i].getSurName() + " has diagnosis: " + n);
            }
        }

        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getMedicalRecordNumber() >= 234000 && patients[i].getMedicalRecordNumber() <= 567000) {
                System.out.println("Patient " + patients[i].getSurName() + " has medical record number in given interval");
            }
        }
    }
}

