package Experiment_9.B;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pay for the  clerk:");
        int pay = sc.nextInt();
        if (pay < 3000 || pay > 10000) {
            try {
                throw new PayOutOfBoundsException("incorrect clerk pay");
            } catch (PayOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        System.out.println("Enter pay for the superintendent:");
        pay = sc.nextInt();
        if (pay < 12000 || pay > 15000) {
            try {
                throw new PayOutOfBoundsException("incorrect superintendent pay");
            } catch (PayOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }
}
