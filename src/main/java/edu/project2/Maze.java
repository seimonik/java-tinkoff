package edu.project2;

import java.io.Console;
import java.util.List;

public final class Maze {
    public final int height;
    public final int width;
    public final TypeCell[][] grid;
    public final Cell start;
    public final Cell end;

    public Maze(int height, int width, TypeCell[][] grid, Cell start, Cell end) {
        this.height = height;
        this.width = width;
        this.grid = grid;
        this.start = start;
        this.end = end;
    }

    public void prettyPrint() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                switch(grid[i][j]){
                    case PASSAGE:
                        System.out.print("O");
                        break;
                    case START:
                        System.out.print("S");
                        break;
                    case WALL:
                        System.out.print("#");
                        break;
                    case END:
                        System.out.print("E");
                        break;
                }
            }
            System.out.print("\n");
        }
    }

    public void solvePrint(List<Cell> solve) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (solve.contains(new Cell(i, j))) {
                    System.out.print("*");
                } else {
                    switch (grid[i][j]) {
                        case PASSAGE:
                            System.out.print("O");
                            break;
                        case START:
                            System.out.print("S");
                            break;
                        case WALL:
                            System.out.print("#");
                            break;
                        case END:
                            System.out.print("E");
                            break;
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
