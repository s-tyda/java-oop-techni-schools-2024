package org.example.syntax;
//Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
public class Zad14 {
    public static void dzialania(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        dzialania(5, 15);
    }
}
