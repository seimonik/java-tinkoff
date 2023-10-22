package edu.hw2.Task2;

public sealed class Rectangle permits Square {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}
