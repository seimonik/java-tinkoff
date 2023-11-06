package edu.project2;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        System.out.println("Обозначения:");
        System.out.println("# - стена\n0 - проход\nS - начальная точка\nE - конечная точка\n* - обозначен найденный маршрут\n");

        System.out.println("Лабиринт:");
        var generator = new Generator();

        var maze = generator.generate(9,21);
        maze.prettyPrint();

        System.out.println("\nРешение:");

        var solve = Solver.solve(maze);
        maze.solvePrint(solve);
    }
}
