package org.example.syntax.christmas;

import java.util.Arrays;

public class Zad03 {
//    3. Napisz metodę, która przyjmie tablicę i zwróci tablicę zawierającą tylko
//    liczby parzyste z poprzedniej tablicy.
    public static int[] parzystee(int[] arr) {
        int[] parzyste = new int[50];
        int nextIndex = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                parzyste[nextIndex] = num;
                nextIndex += 1;
            }
        }
        return parzyste;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 32, 5, 6, 8, 7};
        System.out.println(Arrays.toString(parzystee(array)));
    }
}
