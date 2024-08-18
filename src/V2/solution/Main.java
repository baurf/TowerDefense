package V2.solution;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the game grid
        int gridSize = 5;
        char[][] grid = new char[gridSize][gridSize];

        // Fill the grid with empty spaces
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = '.';
            }
        }

        // Spawn two Enemy objects at random positions with initial health of 10 each
        Enemy enemy1 = spawnRandomEnemy(gridSize);
        Enemy enemy2 = spawnRandomEnemy(gridSize);

        // Create two Tower objects based on user input with a range of 2 and damage of 5
        Tower tower1 = placeTower(gridSize, grid);
        Tower tower2 = placeTower(gridSize, grid);

        // Place enemies and towers on the grid
        grid[enemy1.getX()][enemy1.getY()] = 'E';
        grid[enemy2.getX()][enemy2.getY()] = 'E';
        grid[tower1.getX()][tower1.getY()] = 'T';
        grid[tower2.getX()][tower2.getY()] = 'T';

        // Display the initial grid
        displayGrid(grid);

        // Call the attack method on each Tower object to attack nearby enemies
        tower1.attack(enemy1);
        tower1.attack(enemy1);
        tower2.attack(enemy2);
        tower2.attack(enemy2);

        // Update the grid by removing enemies that have 0 or less health
        if (enemy1.getHealth() <= 0) {
            grid[enemy1.getX()][enemy1.getY()] = '.';
        }
        if (enemy2.getHealth() <= 0) {
            grid[enemy2.getX()][enemy2.getY()] = '.';
        }

        // Display the updated grid
        System.out.println("\nAfter Attack:");
        displayGrid(grid);
    }

    // Method to display the grid
    public static void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to spawn a random enemy on the grid
    public static Enemy spawnRandomEnemy(int gridSize) {
        Random random = new Random();
        int x = random.nextInt(gridSize);
        int y = random.nextInt(gridSize);
        return new Enemy(x, y, 10);
    }

    // Method to allow user to place a tower
    public static Tower placeTower(int gridSize, char[][] grid) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        while (true) {
            System.out.println("Enter the position to place the tower (x y): ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x >= 0 && x < gridSize && y >= 0 && y < gridSize && grid[x][y] == '.') {
                break;
            } else {
                System.out.println("Invalid position or position already occupied. Try again.");
            }
        }
        return new Tower(x, y, 2, 5);
    }
}