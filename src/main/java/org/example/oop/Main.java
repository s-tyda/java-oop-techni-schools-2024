package org.example.oop;

import org.example.oop.humans.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Paweł", "Nowak", 204);
//        human.name = "Gaweł";
//        System.out.println(human.name);
//        human.setName("Robert");
        System.out.println(human.getName());
        System.out.println(human.getSurname());
        System.out.println(human.getHeight());
    }
}
