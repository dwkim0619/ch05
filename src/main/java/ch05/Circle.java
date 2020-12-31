package ch05;

public class Circle {
    private String name;
    private int r;

    public Circle() {
        this("원", 1);
    }

    public Circle(int r) {
        this("원", r);
    }

    public Circle(String name, int r) {
        this.name = name;
        this.r = r;
    }

    public void area() {
        System.out.println("원의 넓이는 " + (Math.PI * r * r));
    }
}
