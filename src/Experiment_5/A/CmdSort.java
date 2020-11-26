package Experiment_5.A;

import java.util.Arrays;

public class CmdSort {
    public static void main(String[] args) {
        //String[] args = {"Hello", "Divide", "Bell", "Java", "Ionic", "Uranus"};
        int size = args.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(args));
    }
}