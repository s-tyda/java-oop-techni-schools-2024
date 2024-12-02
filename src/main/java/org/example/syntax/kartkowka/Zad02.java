package org.example.syntax.kartkowka;

public class Zad02 {
    public static void print(String[] arr){
        for (String napis: arr){
            System.out.println(napis);
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"afafad", "dgsgdg"};
        print(arr);
    }
}
