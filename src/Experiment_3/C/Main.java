package Experiment_3.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the real part:");
        int r1 = sc.nextInt();

        System.out.println("Enter the imaginary part:");
        int i1 = sc.nextInt();

        System.out.println("Enter the real part:");
        int r2 = sc.nextInt();

        System.out.println("Enter the imaginary part:");
        int i2 = sc.nextInt();

        Complex num1 = new Complex(r1, i1);
        Complex num2 = new Complex(r2, i2);


        System.out.println("Addition:" + num1.add(num1, num2).real + " " + num1.add(num1, num2).imaginary + "j");
        System.out.println("Difference:" + num1.subtract(num1, num2).real + " " + num1.subtract(num1, num2).imaginary + "j");
        System.out.println("Product:" + num1.multiply(num1, num2).real + " " + num1.multiply(num1, num2).imaginary + "j");


    }
}
