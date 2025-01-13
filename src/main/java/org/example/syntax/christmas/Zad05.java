package org.example.syntax.christmas;
// Napisz metodę, która przyjmie tablicę i zwróci maksimum tej tablicy.
public class Zad05 {
    public static int max(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        } return max;
    }
}
