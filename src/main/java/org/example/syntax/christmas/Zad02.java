package org.example.syntax.christmas;



public class Zad02 {
    public static void main(String[] args) {
        int[] array = new int[]{6,6};

        System.out.println(Srednia(array));
    }
    public static Double Srednia(int[] array){
        int avg = 0;

        for(int num: array){
            avg += num;
        }

        return (double) avg / array.length;
    }
}

