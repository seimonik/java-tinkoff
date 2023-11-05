package edu.project2;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        var generator = new Generator();

        var maze = generator.generate(13,13);
        maze.prettyPrint();
    }
}
