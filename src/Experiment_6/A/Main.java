package Experiment_6.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher(1098, "Xyz", "B-222,elm street,vcbccnff", "Computers", "C14");
        Officer officer = new Officer(2033, "Uyx", "G-765,balm street,iudgdhfb", 'C');
        Regular regularTypist = new Regular(3011, "Yuzi", "U-345,horrorland,redst hfjj", 20, 2000);
        Adhoc adhocTypist = new Adhoc(3111, "ytrs bgt", "Rtm marg,gdghhddn,iop", 10, 1000);

        System.out.println("Teacher details:");
        System.out.println(teacher.getName() + "\n" + teacher.getCode() + "\n" + teacher.getAddress() + "\n" + teacher.getSubject() + "\n" + teacher.mClass);
        System.out.println("Officer details:");
        System.out.println(officer.getName() + "\n" + officer.getCode() + "\n" + officer.getAddress() + "\n" + officer.Grade);
        System.out.println("Regular Typist details:");
        System.out.println(regularTypist.getName() + "\n" + regularTypist.getCode() + "\n" + regularTypist.getAddress() + "\n" + regularTypist.getSpeed() + "\n" + regularTypist.basic_pay);
        System.out.println("Ad-hoc Typist details:");
        System.out.println(regularTypist.getName() + "\n" + regularTypist.getCode() + "\n" + regularTypist.getAddress() + "\n" + regularTypist.getSpeed() + "\n" + regularTypist.basic_pay);


    }
}
