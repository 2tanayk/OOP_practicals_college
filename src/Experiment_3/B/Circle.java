package Experiment_3.B;

import static java.lang.StrictMath.PI;

public class Circle {
    int c1, c2;
    double r;

    public Circle() {
        c1 = 5;
        c2 = 6;
        r = 7.6;
    }

    private double area() {
        return (PI * r * r);
    }

    private double circumference() {
        return (2 * PI * r);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println("Coordinates: (" + c.c1 + "," + c.c2 + ")");
        System.out.println(c.circumference());
        System.out.println(c.area());
    }
}
