package org.example.syntax.kartkowka;

public class Zad03 {
    public static int fun(int[] arr){
        int sum = 0;
        for (int i: arr){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3422, 2, 1, 452};
        System.out.println(fun(arr));
    }
}
