package Experiment_8.package2;

import java.util.*;

import Experiment_8.package1.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code, speed, basicPay;
        String name, subject, mClass;
        char grade;

        System.out.println("Enter teacher code,name,subject and class:");
        code = sc.nextInt();
        //dummy
        sc.nextLine();
        name = sc.nextLine();
        subject = sc.nextLine();
        mClass = sc.nextLine();


        Teacher teacher = new Teacher(code, name);
        teacher.setSubject(subject);
        teacher.setmClass(mClass);

        System.out.println(teacher.getCode() + "\n" + teacher.getName() + "\n" + teacher.getSubject() + "\n" + teacher.getmClass());

        System.out.println("Enter officer code,name and grade:");
        code = sc.nextInt();
        //dummy
        sc.nextLine();
        name = sc.nextLine();
        grade = sc.next().charAt(0);

        Officer officer = new Officer(code, name);
        officer.setGrade(grade);
        System.out.println(officer.getCode() + "\n" + officer.getName() + "\n" + officer.getGrade());

        System.out.println("Enter regular typist code,name,speed and basic pay:");
        code = sc.nextInt();
        //dummy
        sc.nextLine();
        name = sc.nextLine();
        speed = sc.nextInt();
        basicPay = sc.nextInt();

        Regular rTypist = new Regular(code, name);
        rTypist.setSpeed(speed);
        rTypist.setBasicPay(basicPay);

        System.out.println(rTypist.getCode() + "\n" + rTypist.getName() + "\n" + rTypist.getSpeed() + "\n" + rTypist.getBasicPay());


        System.out.println("Enter ad-hoc typist code,name,speed and basic pay:");
        code = sc.nextInt();
        //dummy
        sc.nextLine();
        name = sc.nextLine();
        speed = sc.nextInt();
        basicPay = sc.nextInt();

        Adhoc aTypist = new Adhoc(code, name);
        aTypist.setSpeed(speed);
        aTypist.setBasicPay(basicPay);

        System.out.println(aTypist.getCode() + "\n" + aTypist.getName() + "\n" + aTypist.getSpeed() + "\n" + aTypist.getBasicPay());


    }
}
