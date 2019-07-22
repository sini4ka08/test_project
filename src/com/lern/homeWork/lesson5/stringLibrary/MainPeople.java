package com.lern.homeWork.lesson5.stringLibrary;

public class MainPeople {
    public static void main(String[] args) {

        People sinica = new People("Olga; 33; 54; 164");

        System.out.println(sinica.comparePeople("Serg; 25; 80; 180"));

        sinica.showAllInfoAboutPerson();

        sinica.ageChange(32);

        sinica.showAllInfoAboutPerson();
    }
}
