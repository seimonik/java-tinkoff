package edu.project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solver {
    static List<Cell> solve(Maze maze){
        Boolean[][] visited = initVisited(maze.height, maze.width);

        Cell end = maze.end;
        Cell currentCell = maze.start;
        Stack<Cell> way = new Stack<>();
        visited[currentCell.x()][currentCell.y()]=true;

        while (!currentCell.equals(end)){
            ArrayList<Cell> neighbours = getNeighbours(maze.grid, currentCell, visited);

            if(neighbours.size()>0){
                way.push(currentCell);

                int randNum = (int) (Math.random() * neighbours.size());
                var neighbourCell = neighbours.get(randNum);
                visited[neighbourCell.x()][neighbourCell.y()]=true;
                currentCell = neighbourCell;
            }
            else if(!way.empty()){
                currentCell = way.pop();
            }
            else{ // выхода нет
                way.clear();
                break;
            }
        }

        return way;
    }

    private static Boolean[][] initVisited(int height, int width) {
        Boolean[][] visited = new Boolean[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                visited[i][j] = false;
            }
        }

        return visited;
    }

    private static ArrayList<Cell> getNeighbours(TypeCell[][] grid, Cell cell, Boolean[][] visited) {
        ArrayList<Cell> result = new ArrayList<>();
        int height = grid.length;
        int width = grid[0].length;

        for (int i = -1; i < 2; i+=2) {
            if (cell.x() + i > 0 && cell.x() + i < height &&
                grid[cell.x() + i][cell.y()] != TypeCell.WALL &&
                !visited[cell.x() + i][cell.y()])
                result.add(new Cell(cell.x() + i, cell.y()));
            if (cell.y() + i > 0 && cell.y() + i < width &&
                grid[cell.x()][cell.y() + i] != TypeCell.WALL &&
                !visited[cell.x()][cell.y() + i])
                result.add(new Cell(cell.x(), cell.y() + i));
        }

        return result;
    }
}
