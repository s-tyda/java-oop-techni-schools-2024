package org.example.syntax;

public class ZadXX {
    public static int max(int[] arr) {
        int result = arr[0];
        for (int element: arr){
            if (element > result){
                result = element;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = new int[]{-2, -6};
        System.out.println(max(x));
    }
}
