package V1.solution;

public class Tower {
    private int x;
    private int y;
    private int range;
    private int damage;

    public Tower(int x, int y, int range, int damage) {
        this.x = x;
        this.y = y;
        this.range = range;
        this.damage = damage;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void attack(Enemy enemy) {
        // Calculate distance between tower and enemy
        int distance = Math.abs(enemy.getX() - this.x) + Math.abs(enemy.getY() - this.y);
        if (distance <= this.range) {
            System.out.println("V1.solution.Tower at (" + this.x + ", " + this.y + ") attacks enemy at (" + enemy.getX() + ", " + enemy.getY() + ")");
            enemy.takeDamage(this.damage);
        } else {
            System.out.println("V1.solution.Enemy at (" + enemy.getX() + ", " + enemy.getY() + ") is out of range.");
        }
    }
}
