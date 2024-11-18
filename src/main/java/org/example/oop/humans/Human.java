package org.example.oop.humans;

public class Human {
    private String name;
    private String surname;
    private int height;

    public Human(String name, String surname, int height) {
        this.name = name;
        this.surname = surname;
        this.height = height;
    }

    public String getName(){
        if (name.equals("Paweł")){
            System.out.println("TAKI CZŁOWIEK NIE MOŻE ISTNIEĆ");
        }
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        if (name.equals("Gaweł")){
            System.out.println("TAKIE IMIĘ NIE ISTNIEJE");
        }
        else {
            this.name = name;
        }
    }
}
