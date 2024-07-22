package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        //Grade Calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();

        if(score>=90 && score<=100) {
            System.out.println("The grade is A");
        }else if(score>=80 && score<=89) {
            System.out.println("The grade is B");
        }else if(score>=70 && score<=79) {
            System.out.println("The grade is C");
        }else if(score>=60 && score<=69) {
            System.out.println("The grade is D");
        }else if(score<=0 || score>=100) {
                System.out.println("Lol are you God");
        }else{
            System.out.println("The grade is F");
        }
        sc.close();
    }
}
