package edu.hw2.Task2;

public final class Square extends Rectangle {
    public Square(int size){
        super(size, size);
    }
    public Square setSize(int size){
        return new Square(size);
    }
}
