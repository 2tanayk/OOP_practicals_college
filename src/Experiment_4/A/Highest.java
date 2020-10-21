package Experiment_4.A;

import java.util.*;

public class Highest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students:");
        int n = sc.nextInt();

        int s[] = new int[n];

        int total = 0, highest = -1;

        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            total += s[i];

            if (i == 0) {
                highest = s[i];
            }
            if (s[i] > highest) {
                highest = s[i];
            }
        }
        System.out.println("Total marks:" + total);
        System.out.println("Highest score:" + highest);
    }
}
