package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //Switch - better way if we have 2 plus conditions

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day -->");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THUR");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No Idea what day it is");
                break;
        }
        System.out.println("Outside the switch condition");
    }
}
