package org.example.syntax;

public class Zad16 {
    public static  boolean czyjestpodzielna(int number){
        if (number % 3 == 0 && number % 5 == 0 ){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(czyjestpodzielna(15));
    }
}
