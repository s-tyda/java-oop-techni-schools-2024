package org.example.oop.products;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread("bread", 4.5, 12);
        System.out.println(bread.total());
    }
}
