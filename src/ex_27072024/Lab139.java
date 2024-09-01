package ex_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {

        //Arrays - using new keyword

        int[] marks = new int[3];
        //index - 0,1,2
        //len - 3
        //default value in array will be zero if we don't store any

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=100;
        marks[2]=101;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
       // System.out.println(marks[10]);

        //default value of string is null
        boolean[] iscorrect = {true,false,true};
        System.out.println(iscorrect[1]);

        for (int i = 0; i < marks.length ; i++) {

            System.out.println(marks[i]);

        }
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        for (int i = 0; i < days.length ; i++) {
            System.out.println(days[i]);

        }


    }
}
