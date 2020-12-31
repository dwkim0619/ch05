package ch05;

public class MainForCircle {
    public static void main(String[] args) {
//        Circle[] circles = new Circle[10];
//        for(int i = 0; i < circles.length; ++i) {
//            circles[i] = new Circle(i + 1);
//            circles[i].area();
//        }

        Circle[] c3 = new Circle[5];
        for (int i = 0; i < c3.length; i++) {
            int result = (int)(Math.random() * 10) + 1;
            c3[i] = new Circle(result);
        }

    }
}
