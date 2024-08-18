package V1.task;

public class TowerClass {

    // ToDo: Task 1: Define the Tower class attributes for position (x, y), range, and damage.
    private int x;
    private int y;
    private int range;
    private int damage;

    // ToDo: Task 2: Create a constructor to initialize the Tower's position, range, and damage.
    public TowerClass(int x, int y, int range, int damage) {
        this.x = x;
        this.y = y;
        this.range = range;
        this.damage = damage;
    }

    // ToDo: Task 3: Implement getter methods for the Tower's x and y coordinates.

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Enemy enemyInstance) {
        // ToDo: Task 4: Implement the attack method which:
        int distance = Math.abs(enemyInstance.getX() - this.x) + Math.abs(enemyInstance.getY() - this.y);

        // - Calculates the distance between the Tower and a given Enemy.
        // - Checks if the Enemy is within the Tower's range.
        // - If within range, prints a message that the Tower attacks the Enemy and reduces the Enemy's health.

        if (distance <= range) {
            enemyInstance.takeDamage(damage);
        }

    }
}
