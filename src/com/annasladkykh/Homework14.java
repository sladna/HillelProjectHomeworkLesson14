package com.annasladkykh;

import java.util.ArrayList;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        HillelGroup hillelGroup = new HillelGroup("Java Introduction", "28.01.21", list);
        System.out.println(hillelGroup);
        System.out.println(hillelGroup.nameOfGroup());
        hillelGroup.addStudent("Petr", "Petrov", "02.02.92", "987-65-43");
        hillelGroup.addStudent("Ivan", "Ivanov", "01.01.91", "123-45-67");
        hillelGroup.printStudentsList();
        hillelGroup.checkStudentInGroup("petrova");
        hillelGroup.deleteStudentBySurname("Ivanov");
        hillelGroup.printStudentsList();
    }
}