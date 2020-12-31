package ch05;

public class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " Point : " + super.toString();
    }
}
