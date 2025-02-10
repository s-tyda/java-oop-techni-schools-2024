package org.example.oop.humans;

public class Teacher extends Human{
    public Teacher(String newName, String newSurname, int newHeight) {
        super(newName, newSurname, newHeight);
    }

    @Override
    void grow() {
        this.height += 10;
        System.out.println("Jestem nauczyciele, rosnę o 10cm");
    }

    @Override
    public void hello() {
        System.out.println("Dzień dobry, jestem nauczycielem!");
    }
}
