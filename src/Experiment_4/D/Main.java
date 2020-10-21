package Experiment_4.D;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        Employee e[] = new Employee[5];

        System.out.println("Enter name,id and hours worked:");

        for (i = 0; i < 5; i++) {
            String name = sc.nextLine();
            int id = sc.nextInt();
            int hrs = sc.nextInt();
            sc.nextLine();//dummy
            e[i] = new Employee(name, id, hrs);
        }


        System.out.println("Id.\t" + "Name\t" + "No of hours\t" + "Wages");
        for (i = 0; i < 5; i++) {
            System.out.println(e[i].getId() + "\t" + e[i].getName() + "\t" + e[i].getHrs() + "\t" + (e[i].getHrs() * 100));
        }


    }
}
