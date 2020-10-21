package Experiment_5.B;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ctu = 0, ctl = 0, cbs = 0, ctd = 0, cts = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                ctu++;
            } else if (Character.isLowerCase(ch)) {
                ctl++;
            } else if (Character.isDigit(ch)) {
                ctd++;
            } else if (Character.isWhitespace(ch)) {
                cbs++;
            } else {
                cts++;
            }

        }
        System.out.println("Uppercase characters:" + ctu + "\nLowercase characters:" + ctl + "\nDigits:" + ctd + "\nWhitespaces:" + cbs + "\nSpecial Characters:" + cts);

    }
}
