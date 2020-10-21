package Experiment_4.B;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();

        int temp = 0, i, j;

        int a[] = new int[n];

        System.out.println("Enter the elements:");

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }//if ends
            }//inner loop ends
        }//outer loop ends

        System.out.println("Array After Bubble Sort:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
