package com.annasladkykh;

/*
1) Написать класс "Группа", для отображения учебной группы в Hillel, который содержит поля:
- название курса
- дата старта занятий
- суммарное количество занятий
- количество занятий в неделю
- список учащихся типа Student у которого есть фамилия, имя, дата рождения и контакты.
Написать методы:
- метод который выдает название группы на основе даты старта и названия курса
- метод который выдает дату последнего занятия
- печатает список студентов по порядку в формате:
И. Иванов
П. Петров
С. Сидоров
- добавить студента
- узнать если ли студент с такой фамилией в группе
- удалить студента по фамилии или по номеру
 */

import java.util.ArrayList;
import java.util.List;

public class HillelGroup {
    private String nameOfCourse;
    private String dateOfStart;
    private int quantityOfLessons;
    private int quantityOfLessonsPerWeek;
    private List<Student> list = new ArrayList<>();

    public HillelGroup(String nameOfCourse, String dateOfStart, int quantityOfLessons, int quantityOfLessonsPerWeek, List<Student> list) {
        this.nameOfCourse = nameOfCourse;
        this.dateOfStart = dateOfStart;
        this.quantityOfLessons = quantityOfLessons;
        this.quantityOfLessonsPerWeek = quantityOfLessonsPerWeek;
        this.list = list;
    }

    public HillelGroup(String nameOfCourse, String dateOfStart, List<Student> list) {
        this.nameOfCourse = nameOfCourse;
        this.dateOfStart = dateOfStart;
        this.list = list;
    }

    public String nameOfGroup() {
        return getNameOfCourse() + " " + getDateOfStart();
    }

    public void addStudent(String name, String surname, String dateOfBirth, String contacts) {
        Student student = new Student(name, surname, dateOfBirth, contacts);
        getList().add(student);
        student.getListOfGroups().add(nameOfGroup());
    }

    public void printStudentsList() {
        for (Student student : getList()) {
            System.out.println(student.getName().charAt(0) + ". " + student.getSurname());
        }
    }

    public void checkStudentInGroup(String surname) {
        for (Student student : getList()) {
            if (student.getSurname().equalsIgnoreCase(surname)) {
                System.out.println("Student exists in the group");
                break;
            } else {
                System.out.println("Student is absent in the group");
                break;
            }
        }
    }

    public void deleteStudentBySurname(String surname) {
        getList().removeIf(student -> student.getSurname().equalsIgnoreCase(surname));
    }

    public void deleteStudentByIndex(int index) {
        getList().removeIf(student -> student.getSurname().equals(getList().get(index).getSurname()));
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public int getQuantityOfLessons() {
        return quantityOfLessons;
    }

    public void setQuantityOfLessons(int quantityOfLessons) {
        this.quantityOfLessons = quantityOfLessons;
    }

    public int getQuantityOfLessonsPerWeek() {
        return quantityOfLessonsPerWeek;
    }

    public void setQuantityOfLessonsPerWeek(int quantityOfLessonsPerWeek) {
        this.quantityOfLessonsPerWeek = quantityOfLessonsPerWeek;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "HillelGroup{" +
                "nameOfCourse='" + nameOfCourse + '\'' +
                ", dateOfStart='" + dateOfStart + '\'' +
                ", quantityOfLessons=" + quantityOfLessons +
                ", quantityOfLessonsPerWeek=" + quantityOfLessonsPerWeek +
                ", list=" + list +
                '}';
    }
}