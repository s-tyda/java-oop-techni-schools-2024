package org.example.oop.humans;

public abstract class Human {
    protected String name;
    private String surname;
    protected int height;

    public Human(){}

    public Human(String newName, String newSurname, int newHeight){
        name = newName;
        surname = newSurname;
        height = newHeight;
    }

    abstract void grow();

    public abstract void hello();
}
