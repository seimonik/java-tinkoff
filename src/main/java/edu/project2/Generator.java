package edu.project2;

import java.util.ArrayList;
import java.util.Stack;

public class Generator {
    private TypeCell[][] initialMatrix(int height, int width) {
        TypeCell[][] initMatrix = new TypeCell[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i % 2 != 0 && j % 2 != 0) && //если ячейка нечетная по x и y,
                    (i < height - 1 && j < width - 1)) { //и при этом находится в пределах стен лабиринта
                    initMatrix[i][j]= TypeCell.UNVISITED;
                }
                else{
                    initMatrix[i][j]=TypeCell.WALL; // стена
                }
            }
        }

        return initMatrix;
    }

    Maze generate(int height, int width) {
        var grid = initialMatrix(height, width);
        Stack<Cell> way = new Stack<>();
        Cell startCell = new Cell(1, 1);
        Cell currentCell = startCell;
        ArrayList<Cell> unvisitedCells = getUnvisitedCells(grid);

        do {
            ArrayList<Cell> neighbours = getNeighbours(grid, currentCell);
            if (neighbours.size() > 0) {
                grid[currentCell.x()][currentCell.y()] = TypeCell.PASSAGE;
                way.push(currentCell);

                int randNum = (int) (Math.random() * neighbours.size());
                var neighbourCell = neighbours.get(randNum);

                var removeWall = removeWall(currentCell, neighbourCell, grid);
                grid[removeWall.x()][removeWall.y()] = TypeCell.PASSAGE;

                currentCell = neighbourCell;
            } else if (!way.empty()) { // если нет соседей, возвращаемся на предыдущую точку
                currentCell = way.pop();
            } else { // если нет соседей и точек в стеке, но не все точки посещены, выбираем случайную из непосещенных
                unvisitedCells = getUnvisitedCells(grid);
                if (unvisitedCells.size() == 0)
                    break;
                int randNum = (int) (Math.random() * unvisitedCells.size());
                currentCell = unvisitedCells.get(randNum);
            }
        } while (unvisitedCells.size() > 0);

        return new Maze(height, width, grid);
    }

    private ArrayList<Cell> getNeighbours(TypeCell[][] grid, Cell cell) {
        ArrayList<Cell> result = new ArrayList<>();
        int height = grid.length;
        int width = grid[0].length;

        for (int i = -2; i < 3; i+=2) {
            if (cell.x() + i > 0 && cell.x() + i < height &&
                grid[cell.x() + i][cell.y()] == TypeCell.UNVISITED)
                result.add(new Cell(cell.x() + i, cell.y()));
            if (cell.y() + i > 0 && cell.y() + i < width &&
                grid[cell.x()][cell.y() + i] == TypeCell.UNVISITED)
                result.add(new Cell(cell.x(), cell.y() + i));
        }

        return result;
    }

    private Cell removeWall(Cell currentCell, Cell neighbourCell, TypeCell[][] grid) {
        int x = neighbourCell.x() - currentCell.x();
        int y = neighbourCell.y() - currentCell.y();

        if (x < 0)
            x++;
        else if (x > 0)
            x--;

        if (y < 0)
            y++;
        else if (y > 0)
            y--;

        return new Cell(currentCell.x() + x, currentCell.y() + y);
    }

    private ArrayList<Cell> getUnvisitedCells(TypeCell[][] grid) {
        ArrayList<Cell> result = new ArrayList<>();
        int height = grid.length;
        int width = grid[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == TypeCell.UNVISITED)
                    result.add(new Cell(i, j));
            }
        }

        return result;
    }
}
