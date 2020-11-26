package Experiment_12;

class Alphabets implements Runnable {
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    public Alphabets(int max, Printer print, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }
    // standard constructors

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        char c = isEvenNumber ? 'B' : 'A';
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number, c);
            } else {
                print.printOdd(number, c);
            }
            number += 2;
            c += 2;
        }
    }
}

class Printer {
    private volatile boolean isOdd;

    synchronized void printEven(int number, char c) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Exception!");
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + c + " " + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number, char c) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Exception!");
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + c + " " + number);
        isOdd = true;
        notify();
    }
}

class A {
    public static void main(String[] args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new Alphabets(26, print, false), "Odd");
        Thread t2 = new Thread(new Alphabets(26, print, true), "Even");
        t1.start();
        t2.start();
    }
}
