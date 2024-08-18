package V1.task;

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

        // ToDo: Task 1: Create two Enemy objects at fixed positions with initial health of 10 each.
        Enemy enemy1 = new Enemy(1, 3, 10);
        Enemy enemy2 = new Enemy(3, 2, 10);

        // ToDo: Task 2: Create two Tower objects at fixed positions with a range of 2 and damage of 5.
        TowerClass towerClass1 = new TowerClass(2, 4, 3, 5);
        ArcherTower towerClass2 = new ArcherTower(1, 4, 3);
        // ToDo:  Task 3: Place the enemies and towers on the grid by marking their positions with 'E' and 'T' respectively.
        grid[enemy1.getX()][enemy1.getY()] = 'E';
        grid[enemy2.getX()][enemy2.getY()] = 'E';
        grid[towerClass1.getX()][towerClass1.getY()] = 'T';
        grid[towerClass2.getX()][towerClass2.getY()] = 'A';
        displayGrid(grid);

        // ToDo: Task 4: Call the attack method on each Tower object to attack a nearby Enemy.
        towerClass1.attack(enemy1);
        towerClass1.attack(enemy2);
        towerClass2.attack(enemy1);
        towerClass2.attack(enemy2);
        // ToDo: Task 5: Update the grid by removing enemies that have 0 or less health.
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
}