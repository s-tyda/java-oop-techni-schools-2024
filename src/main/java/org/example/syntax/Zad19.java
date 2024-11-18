package org.example.syntax;

public class Zad19 {
    public static boolean odcinek(int number1, int number2, int number3) {
        if (number1 + number2 > number3 && number1 + number3 > number2 && number2 + number3 > number1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(odcinek(1,2,3));
    }
}
