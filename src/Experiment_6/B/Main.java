package Experiment_6.B;

import java.util.Arrays;

public class Main implements Helper {

    public static void main(String[] args) {
        Helper helper = new Main();
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix mA = new Matrix(a);
        Matrix mB = new Matrix(b);
        helper.add(mA, mB);

    }

    @Override
    public void add(Matrix a, Matrix b) {
        int result[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a.m[i][j] + b.m[i][j];
            }
        }
        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));

    }
}
