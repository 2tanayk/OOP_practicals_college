package Experiment_12;

import java.util.Scanner;

class Fibonacci implements Runnable {
    private int max;
    private PrintFibonacci print;
    private boolean isEvenNumber;

    public Fibonacci(int max, PrintFibonacci print, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}

class PrintFibonacci {
    private volatile boolean isOdd;

    private volatile int a = 0;
    private volatile int b = 1;
    private volatile int sum = a + b;


    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Exception!");
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + sum);
        //swapping
        a = b;
        b = sum;
        sum = a + b;
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Exception!");
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + sum);
        //swapping
        a = b;
        b = sum;
        sum = a + b;
        isOdd = true;
        notify();
    }
}

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("0 1 ");
        PrintFibonacci print = new PrintFibonacci();
        Thread t1 = new Thread(new Fibonacci(n, print, false), "Odd");
        Thread t2 = new Thread(new Fibonacci(n, print, true), "Even");
        t1.start();
        t2.start();
    }
}
