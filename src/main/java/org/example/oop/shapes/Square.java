package org.example.oop.shapes;

public class Square implements Shape{
    private double a;

    @Override
    public double area() {
        return a * a;
    }
}
