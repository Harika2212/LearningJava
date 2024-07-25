package ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {

        //Factorial program
        // n=5 -> 5*4*3*2*1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int n = sc.nextInt();

        int fact = 1;
        for(int i =1;i<=n;i++) {
            fact = fact * i;
        }
            System.out.println(fact);

            sc.close();

        }


    }

