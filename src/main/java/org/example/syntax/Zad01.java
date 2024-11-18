package org.example.syntax;

public class Zad01 {
    public static void main(String[] args) {
        String zdanie1 = "Pogoda";
        String zdanie2 = "Wrocław";
        String zdanie3 = "DUpa";

        System.out.println(zdanie1);
        System.out.println(zdanie2);
        System.out.println(zdanie3);

        int sumaDlugosci = zdanie1.length() + zdanie2.length() + zdanie3.length();
        System.out.println(sumaDlugosci);
    }
}
