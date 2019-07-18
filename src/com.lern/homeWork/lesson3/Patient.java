package com.lern.homeWork.lesson3;

import java.util.Arrays;

/* Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
Создать массив объектов. Вывести: a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты у которых находится в заданном интервале.*/

public class Patient {

    private static int count;
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private String phoneNumber;
    private int medicalRecordNumber;
    private String diagnosis;

    public Patient() {
        id = count++;
    }

    public Patient(String surName, String name, String middleName, String address, String phoneNumber, int medicalRecordNumber, String diagnosis) {
        id = count++;
        this.surName = surName;
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalRecordNumber = medicalRecordNumber;
        this.diagnosis = diagnosis;
    }

    public String toString() {
        return "Patient {" + "id=" + id + ", surName=" + surName + ", name=" + name +
                ", middleName=" + middleName + ", address=" + address + ", phoneNumber=" + phoneNumber +
                ", medicalRecordNumber=" + medicalRecordNumber + ", diagnosis=" + diagnosis + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
