package org.example.syntax;

/*Napisz metodę, która przyjmie tablicę liczb całkowitych i zwróci iloczyn jej elementów.*/

public class Zad22 {
    public static int sigma(int[] tablica) {
        int y = 1;
        for (int i : tablica) {
            y = y * i;
        }
        return y;
    }
}
