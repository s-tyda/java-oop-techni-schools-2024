package org.example.syntax;

public class Zad09 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {3, 4, 5}};

        int result = 0;
        for (int[] i : arr) {
            for (int j : i) {
                result += j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j];
            }
        }
        System.out.println(result);
    }
}
