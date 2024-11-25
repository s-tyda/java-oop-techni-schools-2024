package org.example.oop;

import org.example.oop.humans.Human;
import org.example.oop.humans.Student;
import org.example.oop.humans.Teacher;

public class Main {
    public static void print(Human human){
        human.print();
    }

    public static void main(String[] args) {
        Human human = new Human("Paweł", "Nowak", 204);
//        human.name = "fsdf";
//        human.name = "Gaweł";
//        System.out.println(human.name);
//        human.setName("Robert");
//        System.out.println(human.getName());
//        System.out.println(human.getSurname());
//        System.out.println(human.getHeight());
//        human.setName("Janusz");

        Human.staticMethod();

//        Car car = new Car("Fiat", "Punto", 2000);
//        System.out.println(car.getManufacturer());
//        System.out.println(car.getModel());
//        System.out.println(car.getYear());
        Teacher teacher = new Teacher("Sebastian", "Tyda", 170);
//        human.print();
//        teacher.print();
//        teacher.name = "Robert";
//        System.out.println(teacher.getName());
        Human human2 = new Teacher("Mati", "Kozioł", 500);
//        human2.print();
        Student student = new Student("Jakis", "Student", 123);
//        Human[] humans = new Human[]{teacher, student};
//        for (Human humanElement : humans){
//            humanElement.print();
//        }

        print(student);
        print(teacher);
        print(human);
//        Teacher teacher2 = new Human("dsgs", "dsgsdg", 3425);
    }
}