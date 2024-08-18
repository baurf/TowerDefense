package V1.solution;

public class Enemy {
    private int x;
    private int y;
    private int health;

    public Enemy(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }

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
        this.health -= damage;
        System.out.println("V1.solution.Enemy at (" + this.x + ", " + this.y + ") takes " + damage + " damage. Remaining health: " + this.health);
    }
}