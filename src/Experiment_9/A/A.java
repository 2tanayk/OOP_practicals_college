package Experiment_9.A;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exception 1
        System.out.println("Enter dividend:");
        int a = sc.nextInt();
        System.out.println("Enter divisor:");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Quotient:" + c);

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //Exception 2
        String s = null;
        try {
            s.length();
        } catch (NullPointerException n) {
            System.out.println(n);
        }
        //Exception 3
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hdhd");
        list.add("789");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            try {
                itr.remove();
            } catch (IllegalStateException i) {
                System.out.println(i);
                break;
            }
        }

    }
}
