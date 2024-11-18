package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int sum(int a, int b){
        return a + b;
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
//        int x = 15;
//        int y = x;
//        y = 20;
//        System.out.println(x);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(x);
//        list.add(y);
//        System.out.println(list);
//
//        List<Integer> list2 = list;
//        System.out.println(list);
//        list2.remove(0);
//        System.out.println(list2);
//        System.out.println(list);
//
//        boolean z = false;
//        char character = 's';
//        String string = "siema";
//        System.out.println(string);
//
//        // Tablice
//        int[] arr = new int[5];
//        arr[0] = 4;
//        System.out.println(arr[0]);
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr2 = new int[]{1, 3, 654, 454, 2137, 34325252};
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(arr2.length);
//
//        int[][] twoDimArray = new int[5][];
//        System.out.println(Arrays.toString(twoDimArray));
//        twoDimArray[0] = new int[4];
//        System.out.println(Arrays.toString(twoDimArray));
//
//        int[][] twoDimArray2 = new int[5][2];
//        System.out.println(Arrays.toString(twoDimArray2));
//        twoDimArray2[0][1] = 4;
//        System.out.println(Arrays.toString(twoDimArray2[0]));
//
//        // Pętle
//        for (int i = 0; i < 3; i++) {
//            System.out.println(i);
//        }
//
//        // Pętla foreach
//        for (int element: arr2){
//            System.out.println(element);
//        }
//
//        // Pętla while
//        int i = 0;
//        while (i < 3){
//            System.out.println(arr2[i]);
//            i++;
//        }
//
//        // To jest to samo
//        i++;
//        i += 1;
//        i = i + 1;

//        4. Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.
//        5. Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40


        print("Hello, World!");

        // To jest błąd
//        System.out.println(print("cokolwiek"));

        System.out.println(sum(2, 5));
        int x = sum(4, 6);
        System.out.println(x);
        sum(5, 8);
    }
}