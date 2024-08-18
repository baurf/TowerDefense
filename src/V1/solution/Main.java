package V1.solution;

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

        // Place static enemies and towers
        Enemy enemy1 = new Enemy(0, 2, 10);
        Enemy enemy2 = new Enemy(2, 4, 10);
        Tower tower1 = new Tower(1, 1, 2, 5);
        Tower tower2 = new Tower(3, 1, 2, 5);

        // Mark enemies and towers on the grid
        grid[enemy1.getX()][enemy1.getY()] = 'E';
        grid[enemy2.getX()][enemy2.getY()] = 'E';
        grid[tower1.getX()][tower1.getY()] = 'T';
        grid[tower2.getX()][tower2.getY()] = 'T';

        // Display the initial grid
        displayGrid(grid);

        // Manually trigger attacks for demonstration
        tower1.attack(enemy1);
        tower1.attack(enemy1);
        tower2.attack(enemy2);

        // Update the grid after attacks
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

    public static void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}