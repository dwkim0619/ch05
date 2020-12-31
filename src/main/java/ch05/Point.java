package ch05;

public class Point {
    private int x;
    private int y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return '(' + x + ", " + y + ')';
    }
}
