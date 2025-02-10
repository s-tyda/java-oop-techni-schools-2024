package org.example.oop;

import org.example.oop.humans.Human;
import org.example.oop.humans.Student;
import org.example.oop.humans.Teacher;

public class Main {
    public static void doHello(Human human){
        human.hello();
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Paweł", "Nowak", 204);
//        Human human = new Human();
//        human.name = "Paweł";
//        human.surname = "Nowak";
//        human.height = 204;


//        System.out.println(teacher.name);
//        System.out.println(teacher.surname);
//        System.out.println(teacher.height);
//        Student student = new Student("Paweł", "Nowak", 204, "id01");
        Student student = new Student("Paweł", "Nowak", 204, "id01");
//        teacher.hello();
        Human[] arr = new Human[]{teacher, student};
        student.hello();
        doHello(teacher);
        doHello(student);
//        for (Human human: arr){
//            human.hello();
//        }
//        System.out.println(student.id);
    }
}