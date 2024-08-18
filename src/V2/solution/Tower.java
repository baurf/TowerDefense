package V2.solution;

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
        int distance = Math.abs(enemy.getX() - this.x) + Math.abs(enemy.getY() - this.y);
        if (distance <= this.range) {
            System.out.println("Tower at (" + this.x + ", " + this.y + ") attacks enemy at (" + enemy.getX() + ", " + enemy.getY() + ")");
            enemy.takeDamage(this.damage);
        } else {
            System.out.println("Enemy at (" + enemy.getX() + ", " + enemy.getY() + ") is out of range.");
        }
    }
}
