package Experiment_5.C;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.println("Enter your choice:\na.Length\nb.Capacity\nc.setLength\nd.setCharAt\ne.Append\nf" +
                ".Delete\ng" +
                ".Substring\nh.Substring(i,j)\ni.Insert\nj.Reverse");
        char ch = sc.next().charAt(0);

        switch (ch) {

            case 'a':
                System.out.println("Length:" + sb.length());
                break;
            case 'b':
                System.out.println("Capacity:" + sb.capacity());
                break;

            case 'c':
                sb.setLength(5);
                System.out.println("Set Length:" + sb);
                break;

            case 'd':
                sb.setCharAt(2, 'X');
                System.out.println("Set charAt:" + sb);
                break;

            case 'e':
                sb.append("Hello");
                System.out.println("Appended:" + sb);
                break;

            case 'f':
                sb.delete(0, 2);
                System.out.println("Deleted:" + sb);
                break;


            case 'g':
                System.out.println("substring:" + sb.substring(2));
                break;

            case 'h':
                System.out.println("substring:" + sb.substring(2, 5));
                break;

            case 'i':
                System.out.println("Inserted:" + sb.insert(3, 't'));
                break;
            case 'j':
                System.out.println("Reversed:" + sb.reverse());
                break;

            default:
                System.out.println("Invalid Choice");

        }


    }
}
