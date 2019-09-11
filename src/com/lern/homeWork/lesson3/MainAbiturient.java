package com.lern.homeWork.lesson3;

public class MainAbiturient {

    public static void main(String[] args) {

        Abiturient ivanov = new Abiturient("Ivanov", "Sergey", "Fedorovich", "s.Minsk, avenue Pushkina, 65-234", "8(029)356-74-89", 6, 5, 4, 3, 6, 5, 3, 5, 6, 6, 5, 6);
        Abiturient petrov = new Abiturient("Petrov", "Ivan", "Sergeevich", "s.Minsk, square Lenina, 19-21", "8(025)356-82-17", 5, 6, 5, 4, 5, 4, 3, 6, 5, 2, 4, 5);
        Abiturient sinicina = new Abiturient("Sinicina", "Olia", "Andreevna", "s.Minsk, st. Yakubovskogo, 78-256", "8(029)274-83-79", 6, 6, 7, 7, 8, 9, 7, 9, 8, 7, 8, 8);
        Abiturient zaretskiy = new Abiturient("Zaretskiy", "Aleksandr", "Eduardovich", "s.Minsk, st. Goshkevicha, 18-90", "8(025)938-04-88", 9, 8, 7, 8, 9, 8, 7, 8, 9, 8, 7, 8);
        Abiturient bulko = new Abiturient("Bulko", "Irina", "Vladimirovna", "s.Minsk, st. Leschinskogo, 38-411", "8(029)241-23-63", 7, 6, 7, 6, 6, 7, 7, 6, 7, 6, 6, 7);

        System.out.println(ivanov.mediumBalls);

        Abiturient[] abiturients = new Abiturient[]{ivanov, petrov, sinicina, zaretskiy, bulko};

        for (int i = 0; i < abiturients.length; i++) {
            System.out.println(abiturients[i].toString());
        }

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].isAbiturientBad()) {
                System.out.println("Abiturient " + abiturients[i].getSurName() + " has unsatisfactory balls");
            }
        }

        for (int i = 0; i < abiturients.length; i++) {
            System.out.println("Abiturient " + abiturients[i].getSurName() + " has average balls: " + abiturients[i].medium());
        }

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].medium() > 6) {
                System.out.println("Abiturient " + abiturients[i].getSurName() + " has average average balls above 6");
            }
        }

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].isAverageBallsMoreThen(6)) {
                System.out.println("Abiturient " + abiturients[i].getSurName() + " has average average balls above 6");
            }
        }

        // задание - выбрать заданное число n абитуриентов, имеющих самый высокий средний балл
        int count = 3;
        for (int i = 0; i < abiturients.length && count > 0; i++, count--) {   // count-- !!!
            Abiturient max = abiturients[i];
            int imax = i;
            for (int j = i + 1; j < abiturients.length; j++) {
                if (abiturients[j].medium() > max.medium()) { // именно с max.medium()!!!
                    max = abiturients[j];
                    imax = j;
                }
            }
            if (i != imax) {
                Abiturient chanAbit = abiturients[i];
                abiturients[i] = abiturients[imax];
                abiturients[imax] = chanAbit;
            }
                    System.out.println("Abiturients " + abiturients[i].getSurName() + " has one of the highest average balls");
            }

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].medium() < 8 && abiturients[i].medium() > 7) {
                System.out.println("Abiturient " + abiturients[i].getSurName() + " has half pass balls");
            }
        }
    }
}
