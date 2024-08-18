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

        // ToDo: Task 2: Create two Tower objects at fixed positions with a range of 2 and damage of 5.

        // ToDo:  Task 3: Place the enemies and towers on the grid by marking their positions with 'E' and 'T' respectively.

        displayGrid(grid);

        // ToDo: Task 4: Call the attack method on each Tower object to attack a nearby Enemy.

        // ToDo: Task 5: Update the grid by removing enemies that have 0 or less health.

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