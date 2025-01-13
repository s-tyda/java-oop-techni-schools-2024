package org.example.oop;

import org.example.oop.humans.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Paweł", "Nowak", 204);
//        Human human = new Human();
//        human.name = "Paweł";
//        human.surname = "Nowak";
//        human.height = 204;
        System.out.println(human.name);
        System.out.println(human.surname);
        System.out.println(human.height);
    }
}