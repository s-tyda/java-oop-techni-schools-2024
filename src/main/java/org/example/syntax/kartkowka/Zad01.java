package org.example.syntax.kartkowka;

public class Zad01 {
    public static int dzielenie(int a, int b){
        if (b == 0){
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(dzielenie(4, 2));
    }
}
