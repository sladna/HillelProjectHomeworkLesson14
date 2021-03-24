package com.annasladkykh;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String contacts;
    private final List<String> listOfGroups = new ArrayList<>();

    public Student(String name, String surname, String dateOfBirth, String contacts) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.contacts = contacts;
    }

    public Student(String name, String surname, String contacts) {
        this.name = name;
        this.surname = surname;
        this.contacts = contacts;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public List<String> getListOfGroups() {
        return listOfGroups;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", contacts='" + contacts + '\'' +
                ", listOfGroups=" + listOfGroups +
                '}';
    }
}