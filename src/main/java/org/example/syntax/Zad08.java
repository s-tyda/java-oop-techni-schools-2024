package org.example.syntax;

public class Zad08 {

    //Napisz program pobierający trójelementową
    // tablicę liczb i zwracający największą liczbę.
    public static void main(String[] args) {
        int[] arr = new int[]{-1,-2,-33};
        int max = arr[0];
        for(int el: arr) {
            if (el > max) {
                max = el;
            }
        }
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
        System.out.println(max);
    }
}
