package org.example.syntax.christmas;

public class Zad04 {
    public static int min(int arr[]) {
        int minimum = arr[0];
        for (int i: arr) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 3, 9};
        System.out.println(min(arr));
    }
}
