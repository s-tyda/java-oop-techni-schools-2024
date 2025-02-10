package org.example.oop.humans;

public class Student extends Human {
    public String id;

    public Student(String newName, String newSurname, int newHeight) {
        super(newName, newSurname, newHeight);
    }

    @Override
    void grow() {

    }

    public Student(String newName, String newSurname, int newHeight, String id) {
        super(newName, newSurname, newHeight);
        this.id = id;
    }

    @Override
    public void hello() {
        System.out.println(this.name);
        System.out.println("Siema jestem studentem!");
    }
}
