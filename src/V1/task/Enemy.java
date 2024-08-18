package V1.task;

public class Enemy {

    // ToDo: Task 1: Define the Enemy class attributes for position (x, y) and health.
    private int x;
    private int y;
    public int health;

    // ToDo: Task 2: Create a constructor to initialize the Enemy's position and health.
    public Enemy(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }


    // ToDo: Task 3: Implement getter methods for the Enemy's x and y coordinates, and health.
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        // ToDo: Task 4: Implement a method called takeDamage that reduces the Enemy's health by a specified amount.
        // - This method should print the damage taken and the Enemy's remaining health.
        health = health - damage;
        System.out.println("\nDamage taken: " + damage + " \n New tower health " + health);
    }
}