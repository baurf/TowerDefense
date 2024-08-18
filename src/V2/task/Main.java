package V2.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gridSize = 5;
        char[][] grid = new char[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = '.';
            }
        }

        // ToDo: Modify the Enemy creation to spawn two enemies at random positions on the grid.
        // ToDo: Modify the Tower creation to allow the user to place two towers on the grid at specified positions.

        Enemy enemy1 = new Enemy(0, 2, 10);
        Enemy enemy2 = new Enemy(2, 4, 10);
        Tower tower1 = new Tower(1, 1, 2, 5);
        Tower tower2 = new Tower(3, 1, 2, 5);

        grid[enemy1.getX()][enemy1.getY()] = 'E';
        grid[enemy2.getX()][enemy2.getY()] = 'E';
        grid[tower1.getX()][tower1.getY()] = 'T';
        grid[tower2.getX()][tower2.getY()] = 'T';

        displayGrid(grid);

        tower1.attack(enemy1);
        tower1.attack(enemy1);
        tower2.attack(enemy2);

        if (enemy1.getHealth() <= 0) {
            grid[enemy1.getX()][enemy1.getY()] = '.';
        }
        if (enemy2.getHealth() <= 0) {
            grid[enemy2.getX()][enemy2.getY()] = '.';
        }

        System.out.println("\nAfter Attack:");
        displayGrid(grid);
    }

    public static void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static V2.solution.Enemy spawnRandomEnemy(int gridSize) {
        // ToDo: generate x & y randomly
        return new V2.solution.Enemy(-1, -1, 10);
    }

    public static V2.solution.Tower placeTower(int gridSize, char[][] grid) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        while (true) {
            System.out.println("Enter the position to place the tower x: ");
            // ToDo: use scanner to scan user input for x
            System.out.println("Enter the position to place the tower y: ");
            // ToDo: use scanner to scan user input for y

//          // ToDo: check eb x & y validi positione sind
//            if () {
//                Exit loop
//            } else {
//                System.out.println("Invalid position or position already occupied. Try again.");
//            }
        }
        return new V2.solution.Tower(-1, -1, 2, 5);
    }
}