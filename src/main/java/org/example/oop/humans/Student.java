package org.example.oop.humans;

public class Student extends Human {

    public Student(String name, String surname, int height) {
        super(name, surname, height);
    }

    @Override
    public void print() {
        System.out.println("Im student");
    }
}
