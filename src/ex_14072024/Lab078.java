package ex_14072024;

import java.sql.SQLOutput;

public class Lab078 {
    public static void main(String[] args) {
        String S1 = "Harika";
        String S2 = S1.toLowerCase();
        System.out.println(S2);

        boolean S3 = S1.equals(S2);
        boolean S4 = S1==S2;
        boolean S5 = S1.equalsIgnoreCase(S2);
        // Harika = harika = hArika = HARIKA

        String S6 = S1.substring(0,5);
        int S7 = S1.indexOf('r');
        int len = S1.length();
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);
        System.out.println(S5);
        System.out.println(S6);
        System.out.println(S7);
        System.out.println(len);
    }
}
