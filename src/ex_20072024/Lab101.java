package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //write a program to print name,age,salary

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("Enter the salary");
        float sal = sc.nextFloat();

        System.out.println("The name is " +name);
        System.out.println("The age is " +age);
        System.out.println("The sal is " +sal);


    }
}
