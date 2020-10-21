package Experiment_7;

import java.util.Vector;

public class A {
    public static void main(String[] args) {
        Vector<String> cV = new Vector<>();

        for (int i = 0; i < 5; i++) {
            cV.add(args[i]);
        }
        System.out.println(cV);

    }
}
