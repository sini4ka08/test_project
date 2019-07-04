package com.lern.homeWork.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animals cat = new Animals();
        cat.setName("Marusia");
        cat.setAge(7);
        cat.setWeight(10);
        cat.setHeight(30);
        Animals dog = new Animals("Caezar", 9, 3, 15);
        Animals tiger = new Animals("Tigrulia", 5, 30, 50);
        cat.show();
        dog.show();
        tiger.show();
        System.out.println("cat == dog: " + cat.equals(dog));
        System.out.println("cat == tiger: " + cat.equals(tiger));
        System.out.println("Поля объекта в сравнении с пороговыми значениями - cat - " + cat.equalsPorog());
        System.out.println("Поля объекта в сравнении с пороговыми значениями - dog - " + dog.equalsPorog());
        System.out.println("Поля объекта в сравнении с пороговыми значениями - tiger - " + tiger.equalsPorog());
        System.out.println();

        Abiturient ivanov = new Abiturient(123, "Ivanov", "Sergey", "Fedorovich", "s.Minsk, avenue Pushkina, 65-234", "8(029)356-74-89", 5, 6, 5, 4, 5, 4, 3, 6, 5, 2, 4, 5);
        Abiturient petrov = new Abiturient(456, "Petrov", "Ivan", "Sergeevich", "s.Minsk, square Lenina, 19-21", "8(025)356-82-17", 6, 5, 4, 3, 6, 5, 3, 5, 6, 6, 5, 6);
        Abiturient sinicina = new Abiturient(789, "Sinicina", "Olia", "Andreevna", "s.Minsk, st. Yakubovskogo, 78-256", "8(029)274-83-79", 6, 6, 7, 7, 8, 9, 7, 9, 8, 7, 8, 8);
        Abiturient zaretskiy = new Abiturient(234, "Zaretskiy", "Aleksandr", "Eduardovich", "s.Minsk, st. Goshkevicha, 18-90", "8(025)938-04-88", 9, 8, 7, 8, 9, 8, 7, 8, 9, 8, 7, 8);
        Abiturient bulko = new Abiturient(567, "Bulko", "Irina", "Vladimirovna", "s.Minsk, st. Leschinskogo, 38-411", "8(029)241-23-63", 7, 6, 7, 6, 6, 7, 7, 6, 7, 6, 6, 7);

        Abiturient[] abiturients = new Abiturient[]{ivanov, petrov, sinicina, zaretskiy, bulko};
        for (int i = 0; i < abiturients.length; i++) {
            System.out.println(abiturients[i].toString());
        }

        for (int i = 0; i < abiturients.length; i++) {
            abiturients[i].isAbiturientBad();
        }

        for (int i = 0; i < abiturients.length; i++) {
            System.out.println(abiturients[i].medium());
        }

        /*for (int i = 0; i < abiturients.length; i++) {
            abiturients[i].isAbiturientAboveAverage();
        }*/

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].medium() > 6) {
                System.out.println(abiturients[i].getSurName() + " имеет средний балл выше 6");
            }
        }

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].medium() <= Abiturient.MAX_BALL && abiturients[i].medium() >= 6) {
                System.out.println(abiturients[i].getSurName() + " имеет один из самых высоких средних баллов");
            }
        }

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].medium() < 8 && abiturients[i].medium() >= 6.5) {
                System.out.println(abiturients[i].getSurName() + " имеет полупроходной балл");
            }
        }

        Patient ivanova = new Patient(123, "Ivanova", "Svetlana", "Fedorovna", "s.Minsk, avenue Pushkina, 65-234", "8(029)356-74-89", 123000, "sore throat");
        Patient petrova = new Patient(456, "Petrova", "Alena", "Sergeevna", "s.Minsk, square Lenina, 19-21", "8(025)356-82-17", 456000, "headache");
        Patient sinicin = new Patient(789, "Sinicin", "Oleg", "Andreevich", "s.Minsk, st. Yakubovskogo, 78-256", "8(029)274-83-79", 789000, "back hurts");
        Patient zaretskia = new Patient(234, "Zaretskia", "Aleksandra", "Eduardovna", "s.Minsk, st. Goshkevicha, 18-90", "8(025)938-04-88", 234000, "stomachache");
        Patient mulko = new Patient(567, "Mulko", "Evgeniy", "Vladimirovich", "s.Minsk, st. Leschinskogo, 38-411", "8(029)241-23-63", 567000, "toothache");

        // почему, если начинать номер медицинской карты с нулей (000123), то выводится другое число (83)?

        Patient[] patients = new Patient[]{ivanova, petrova, sinicin, zaretskia, mulko};
        for (int i = 0; i < patients.length; i++) {
            System.out.println(patients[i].toString());
        }

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("enter diagnosis");
        for (int i = 0; i < patients.length; i++) {
            patients[i].showPatientByDiagnosis(scanner.nextLine());
        }*/

        for (int i = 0; i < patients.length; i++) {
            patients[i].showPatientBySetInterval();
        }
    }
}
