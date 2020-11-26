package Experiment_3.A;

import static java.lang.StrictMath.PI;

public class MethodOverloading {
    public int area(int l, int b) {
        return (l * b);
    }

    public int area(int s) {
        return (s * s);
    }

    public double area(long r) {
        return (PI * r * r);
    }

    public double area(double b, double h) {
        return (0.5 * b * h);
    }


}
