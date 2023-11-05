package edu.project2;

import java.io.Console;

public final class Maze {
    private final int height;
    private final int width;
    private final TypeCell[][] grid;

    public Maze(int height, int width, TypeCell[][] grid) {
        this.height = height;
        this.width = width;
        this.grid = grid;
    }

    public void prettyPrint() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == TypeCell.PASSAGE)
                    System.out.print(" ");
                else System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
