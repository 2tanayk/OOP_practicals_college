package Experiment_4.C;

import java.util.*;

public class Symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int at[][] = new int[3][3];
        int i, j, flag = 0;

        System.out.println("Enter the elements of the 3x3 matrix:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                int t = sc.nextInt();
                a[i][j] = t;
                at[j][i] = t;
            }//inner loop ends
        }//outer loop ends

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] != at[i][j]) {
                    flag++;
                    break;
                }
            }//inner loop ends
        }//outer loop ends

        if (flag == 0) {
            System.out.println("The matrix is symmetric");
        } else {
            System.out.println("The matrix is not symmetric");
        }

    }
}
