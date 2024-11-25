package org.example.oop.humans;

public class Teacher extends Human {
    public Teacher(String name, String surname, int height) {
        super(name, surname, height);
    }

    @Override
    public void print() {
        System.out.println("Im teacher");
    }

    public void example(){
        name = "dsgsdg";
    }
}
