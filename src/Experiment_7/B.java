package Experiment_7;


import java.util.Scanner;
import java.util.Vector;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> names = new Vector<>();

        for (int i = 0; i < 5; i++) {
            names.add(sc.nextLine());
        }

        boolean flag = true;
        do {
            System.out.println(" i.Add new name anywhere in the vector\n" +
                    " ii.Delete name taken from the user\n" +
                    " iii.Display all names");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    String name = sc.nextLine();
                    int pos = sc.nextInt();
                    names.add(pos - 1, name);
                    System.out.println(names);
                    break;
                case 2:
                    name = sc.nextLine();
                    names.remove(name);
                    System.out.println(names);
                    break;
                case 3:
                    System.out.println(names);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (flag);


    }
}
