package homework;

import java.util.Scanner;

public class leapyear_200724 {
    public static void main(String[] args) {

        //leap year - year%4 ==0

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year%4==0  && year%100!=0 || year%400==0){
            System.out.println("Leap Year");

        }else{
            System.out.println("Not a leap year");
        }
    }
}
